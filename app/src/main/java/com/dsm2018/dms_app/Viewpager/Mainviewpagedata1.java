package com.dsm2018.dms_app.Viewpager;

public class Mainviewpagedata1 {

    private String year;
    private String month;
    private String day;
    private String vip;
    private String breakfast;
    private String lunch;
    private String dinner;


    public Mainviewpagedata1(String year, String month, String day, String vip, String breakfast, String lunch, String dinner) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.vip = vip;
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }


    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

}
