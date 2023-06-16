package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    //Variables
    private int id;  //Customer id
    private String name;  //Customer name
    private int charge = 0;  //Current charge for customer
    private int balance = 0;  //Running total for customer
    private String date;

    //Lists
    //private Map<String, Customer> customerMap = new HashMap<>();
    private List<AccountRecord> charges = new ArrayList<>();  //Array list of account record charges
    private List<Customer> cusRecord = new ArrayList<>();  //Customer Array list to be returned

    public List<AccountRecord> getCharges() {return charges;}

    //Functions
    public int getId() {return id;}  //Returns the ID  of the object

    public void setId(int id) {this.id = id;}  //Sets the ID of the object

    public String getName() {
        return name;
    }  //Returns the name of the object

    public void setName(String name) {this.name = name;}  //Sets the name of the object

    public int setBalance(int curCharge) {
        balance = balance + curCharge;
        return balance;
    }
    public int getBalance(Customer curCustomer) {
        return curCustomer.balance;
    }

    public String toString(Customer curCust) {
        return "Customer ID:\n" + curCust.getId() + "Customer name:\n" + curCust.getName() + "Customer balance:" +
                curCust.getBalance(curCust);
    }

    public List<Customer> convertToCustomerList(List<String[]> cRecords) {
        for (String[] record : cRecords) {
            Customer curCustomer = new Customer();  //Creates Customer object to be added to
            curCustomer.id = Integer.parseInt(record[0]);
            curCustomer.name = record[1];
            curCustomer.charge = Integer.parseInt(record[2]);
            curCustomer.date = record[3];

            if(cusRecord.contains(curCustomer)){  //Check if Customer ID exists
                curCustomer.balance = curCustomer.balance + curCustomer.charge;  //Update balance
            }
            else{
                cusRecord.add(curCustomer);
            }
        }
        for(int i = 0; i < cusRecord.size(); ++i){
            System.out.println("num" + i + "\n" + toString(cusRecord.get(i)));
        }

        return cusRecord;
    }
}
