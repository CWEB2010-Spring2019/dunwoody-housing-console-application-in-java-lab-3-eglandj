package com.dunwoody;

abstract class Resident {
    protected String ID_Number, studentType, firstName, lastName;
    protected int floorNumber, roomNumber;
    protected double fee;

    public Resident(String TypeStudent, String Fname, String Lname, int Floor, int Room){
        this.studentType = TypeStudent;
        this.firstName = Fname;
        this.lastName = Lname;
        this.floorNumber = Floor;
        this. roomNumber = Room;
    }
}