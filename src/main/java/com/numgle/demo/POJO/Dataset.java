package com.numgle.demo.POJO;

public class Dataset {
    private String[] cho;
    private String[] jung;
    private String[] jong;
    private String[][] cj;
    private String[] han;
    private String[] englishUpper;
    private String[] englishLower;
    private String[] number;
    private String[] special;
    private Range range;

    public String[] getCho() {
        return this.cho;
    }

    public void setCho(String[] cho) {
        this.cho = cho;
    }

    public String[] getJung() {
        return this.jung;
    }

    public void setJung(String[] jung) {
        this.jung = jung;
    }

    public String[] getJong() {
        return this.jong;
    }

    public void setJong(String[] jong) {
        this.jong = jong;
    }

    public String[][] getCj() {
        return this.cj;
    }

    public void setCj(String[][] cj) {
        this.cj = cj;
    }

    public String[] getHan() {
        return this.han;
    }

    public void setHan(String[] han) {
        this.han = han;
    }

    public String[] getEnglishUpper() {
        return this.englishUpper;
    }

    public void setEnglishUpper(String[] englishUpper) {
        this.englishUpper = englishUpper;
    }

    public String[] getEnglishLower() {
        return this.englishLower;
    }

    public void setEnglishLower(String[] englishLower) {
        this.englishLower = englishLower;
    }

    public String[] getNumber() {
        return this.number;
    }

    public void setNumber(String[] number) {
        this.number = number;
    }

    public String[] getSpecial() {
        return this.special;
    }

    public void setSpecial(String[] special) {
        this.special = special;
    }

    public Range getRange() {
        return this.range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "{" +
            " cho='" + getCho() + "'" +
            ", jung='" + getJung() + "'" +
            ", jong='" + getJong() + "'" +
            ", cj='" + getCj() + "'" +
            ", han='" + getHan() + "'" +
            ", englishUpper='" + getEnglishUpper() + "'" +
            ", englishLower='" + getEnglishLower() + "'" +
            ", number='" + getNumber() + "'" +
            ", special='" + getSpecial() + "'" +
            ", range='" + getRange() + "'" +
            "}";
    }

}

class Range {
    private RangeInfo completeHangul;
    private RangeInfo notCompleteHangul;
    private RangeInfo uppercase;
    private RangeInfo lowercase;
    private RangeInfo number;
    private int[] special;

    public RangeInfo getCompleteHangul() {
        return this.completeHangul;
    }

    public void setCompleteHangul(RangeInfo completeHangul) {
        this.completeHangul = completeHangul;
    }

    public RangeInfo getNotCompleteHangul() {
        return this.notCompleteHangul;
    }

    public void setNotCompleteHangul(RangeInfo notCompleteHangul) {
        this.notCompleteHangul = notCompleteHangul;
    }

    public RangeInfo getUppercase() {
        return this.uppercase;
    }

    public void setUppercase(RangeInfo uppercase) {
        this.uppercase = uppercase;
    }

    public RangeInfo getLowercase() {
        return this.lowercase;
    }

    public void setLowercase(RangeInfo lowercase) {
        this.lowercase = lowercase;
    }

    public RangeInfo getNumber() {
        return this.number;
    }

    public void setNumber(RangeInfo number) {
        this.number = number;
    }

    public int[] getSpecial() {
        return this.special;
    }

    public void setSpecial(int[] special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "{" +
            " completeHangul='" + getCompleteHangul() + "'" +
            ", notCompleteHangul='" + getNotCompleteHangul() + "'" +
            ", uppercase='" + getUppercase() + "'" +
            ", lowercase='" + getLowercase() + "'" +
            ", number='" + getNumber() + "'" +
            ", special='" + getSpecial() + "'" +
            "}";
    }

}

class RangeInfo {
    private int start;
    private int end;

    public int getStart() {
        return this.start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return this.end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "{" +
            " start='" + getStart() + "'" +
            ", end='" + getEnd() + "'" +
            "}";
    }

}