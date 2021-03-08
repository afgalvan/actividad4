package edu.unicesar.taller.cuarto.points.clock;


import java.util.Arrays;
import java.util.HashMap;

public enum Numbers {
    ONE(1, "uno"),
    TWO(2, "dos"),
    THREE(3, "tres"),
    FOURTH(4, "cuatro"),
    FIVE(5, "cinco"),
    SIX(6, "seis"),
    SEVEN(7, "siete"),
    EIGHT(8, "ocho"),
    NINE(9, "nueve"),
    TEN(10, "diez"),
    ELEVEN(11, "once"),
    TWELVE(12, "doce"),
    THIRTEEN(13, "trece"),
    FOURTEEN(14, "catorce"),
    FIFTEEN(15, "quince"),
    TWENTY(20, "veinte"),
    THIRTY(30, "treinta"),
    FOURTY(40, "cuarenta"),
    FIFTY(50, "cincuenta"),
    SIXTY(60, "sesenta");

    private static final HashMap<Integer, Numbers> enumById = new HashMap<>();

    static {
        Arrays.stream(values()).forEach(e -> enumById.put(e.getIndex(), e));
    }

    private final int hourIndex;
    private final String hourText;

    Numbers(int i, String text) {
        this.hourIndex = i;
        this.hourText = text;
    }

    private int getIndex() {
        return hourIndex;
    }

    private String getHourText() {
        return hourText;
    }

    public static String toText(int i) {
        try {
            return enumById.get(i).getHourText();
        } catch (NullPointerException e) {
            return "";
        }
    }
}
