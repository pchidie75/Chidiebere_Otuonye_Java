package com.company;

public class AccountRecord {
    private int charge;  //Charge on account
    private String chargeDate;  //Date charge occurred


    public int getCharge() {return charge;}  //Returns value of charge

    public void setCharge(int charge) {this.charge = charge;}  //Sets the value of the charge

    public String getChargeDate() {
        return chargeDate;
    }  //Gets the date of the charge

    public void setChargeDate(String chargeDate) {
        this.chargeDate = chargeDate;
    }  //Sets the date of the charge
}
