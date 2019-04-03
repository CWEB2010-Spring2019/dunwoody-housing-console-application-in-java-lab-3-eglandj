package com.dunwoody;

import java.text.NumberFormat;

abstract class Resident {
    protected String ID_Number, studentType, firstName, lastName;
    protected int floorNumber, roomNumber;
    protected double fee;

    public Resident(String Fname, String Lname, int Floor, int Room){

        this.firstName = Fname;
        this.lastName = Lname;
        this.floorNumber = Floor;
        this. roomNumber = Room;
    }
    public String toString(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return String.format("|%-20s","ID Number: " + ID_Number) +
                String.format("|%-30s","Student Type: " + studentType) + String.format("|%-26s","First Name: " + firstName) +
                String.format("|%-26s","Last Name: " + lastName) + String.format("|%-26s","Floor Number: " + floorNumber)
                + String.format("|%-26s","Room Number: " + roomNumber) + String.format("|%-26s|","Student Fee: "
                + formatter.format(fee));
    }
}