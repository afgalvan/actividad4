package edu.unicesar.taller.cuarto.points.store;

public class Product {
    private int code;
    private String name;
    private double originalPrice;
    private double utilityPercent;
    private double publicPrice;

    public Product() { }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getUtilityPercent() {
        return utilityPercent;
    }

    public void setUtilityPercent(double utilityPercent) {
        this.utilityPercent = utilityPercent;
    }

    public void computePublicPrice() {
        if (utilityPercent >= 100) {
            utilityPercent += 0.5;
        }
        publicPrice = Math.abs(originalPrice * 100 / (100 - utilityPercent));
    }

    public double getPublicPrice() {
        computePublicPrice();
        return publicPrice;
    }
}
