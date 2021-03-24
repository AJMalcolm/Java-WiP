package com.sparta.AMalcolm;

public abstract class Spartan {

    private String spartanName;
    private String spartanAddress;
    private String spartanContactNumber;
    private double pay;
    private static int idGen;
    private int spartanId;

    static{
        idGen = 100;
    }

    {
        idGen++;
    }

    public Spartan(String spartanName, String spartanAddress, String spartanContactNumber) {
        this.spartanName = spartanName;
        this.spartanAddress = spartanAddress;
        this.spartanContactNumber = spartanContactNumber;
        spartanId = idGen;
    }

    public String getSpartanName() {
        return spartanName;
    }

    public void setSpartanName(String spartanName) {
        this.spartanName = spartanName;
    }

    public String getSpartanAddress() {
        return spartanAddress;
    }

    public void setSpartanAddress(String spartanAddress) {
        this.spartanAddress = spartanAddress;
    }

    public String getSpartanContactNumber() {
        return spartanContactNumber;
    }

    public void setSpartanContactNumber(String spartanContactNumber) {
        this.spartanContactNumber = spartanContactNumber;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getSpartanId() {
        return spartanId;
    }

    public void setSpartanId(int spartanId) {
        this.spartanId = spartanId;
    }
}
