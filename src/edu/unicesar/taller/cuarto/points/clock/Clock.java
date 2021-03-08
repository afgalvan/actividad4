package edu.unicesar.taller.cuarto.points.clock;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Clock {
    private byte hours;
    private byte minutes;
    private byte seconds;
    private final String meridian;
    private char format;

    private static final BiFunction<Byte, Byte, Integer> reduce = (n, min) -> (n > 0) ? n - 1 : n + min;
    private static final BiFunction<Byte, Byte, Integer> increment = (n, max) -> (n < max) ? n + 1 : n - max;

    public Clock(int hours, int minutes, int seconds) {
        this.hours = (byte) hours;
        this.minutes = (byte) minutes;
        this.seconds = (byte) seconds;
        this.meridian = (hours > 11) ? " p.m" : " a.m";
    }

    public void setFormat(char format) {
        this.format = format;
    }

    public void HHAdd() {
        hours = increment.apply(hours, (byte) 23).byteValue();
    }

    public void HHReduce() {
        hours = reduce.apply(hours, (byte) 23).byteValue();
    }

    public void MMAdd() {
        minutes = increment.apply(minutes, (byte) 60).byteValue();
        if (minutes == 60) {
            minutes = 0;
            hours += 1;
        }
    }

    public void MMReduce() {
        minutes = reduce.apply(minutes, (byte) 60).byteValue();
        if (minutes == 60) {
            minutes = 59;
            hours -= 1;
        }
    }

    public void SSAdd() {
        seconds = increment.apply(seconds, (byte) 60).byteValue();
        if (seconds == 60) {
            seconds = 0;
            minutes += 1;
        }
    }

    public void SSReduce() {
        seconds = reduce.apply(seconds, (byte) 60).byteValue();
        if (seconds == 60) {
            seconds = 59;
            minutes -= 1;
        }
    }

    private String textHour() {
        byte _hours = hours;
        _hours = (_hours == 0) ? 12 : _hours;
        _hours = (_hours > 12) ? (byte) (_hours - 12) : _hours;
        int unit = minutes % 10;
        int ten = (minutes / 10) % 10;

        String hoursText = Numbers.toText(_hours);
        String minutesText = (Numbers.toText(ten * 10).isEmpty()) ? "" : " y " + Numbers.toText(ten * 10);
        minutesText += (Numbers.toText(unit).isEmpty()) ? "" : " y " + Numbers.toText(unit);

        if (hours == 1) {
            hoursText = "una";
        }
        return hoursText + minutesText + meridian.replace(".", "");
    }

    private String militaryHour() {
        Function<Byte, String> militaryFormat = (t) -> {
            String timeStr = String.valueOf(t);
            return (timeStr.length() == 1) ? "0" + timeStr : timeStr;
        };

        return String.format("%s:%s:%s", militaryFormat.apply(hours),
            militaryFormat.apply(minutes), militaryFormat.apply(seconds));
    }

    private String meridianHour() {
        byte _hours = hours;
        _hours = (_hours == 0) ? 12 : _hours;
        _hours = (_hours > 12) ? (byte) (_hours - 12) : _hours;
        return String.format("%s:%s:%s%s", _hours, minutes, seconds, meridian);
    }

    public String getHour() {
        switch (format) {
            case '0':
                return militaryHour();
            case '1':
                return meridianHour();
            case '2':
                return textHour();
            default:
                break;
        }
        return "";
    }
}
