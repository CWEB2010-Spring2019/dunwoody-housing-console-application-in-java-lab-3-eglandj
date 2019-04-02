package com.dunwoody;

abstract class Resident {
    protected String studentType, firstName, lastName;
    protected int ID_Number, floorNumber, roomNumber;

    public Resident(String TypeStudent, String Fname, String Lname, Integer Floor, Integer Room){
        this.studentType = TypeStudent;
        this.firstName = Fname;
        this.lastName = Lname;
        this.floorNumber = Floor;
        this. roomNumber = Room;
    }
}