package com.rishav.instaclone;

public class DonateStore {

    private String Dname;
    private String Fname;
    private int Phno;
    private String Desc;
    private double Long;
    private double Lat;

    public DonateStore(){

    }

    public DonateStore(String dname, String fname, String phno, String desc, double longitude, double latitude) {
        Dname = dname;
        Fname = fname;
        Phno = Integer.parseInt(phno);
        Desc = desc;
        Long = longitude;
        Lat = latitude;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public int getPhno() {
        return Phno;
    }

    public void setPhno(int phno) {
        Phno = phno;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public double getLong() {
        return Long;
    }

    public void setLong(double aLong) {
        Long = aLong;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }
}
