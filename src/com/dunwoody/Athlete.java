package com.dunwoody;

public class Athlete extends Resident {
    public Athlete(String TypeStudent, String Fname, String Lname, int Floor, int Room){
        super(TypeStudent, Fname, Lname, Floor,Room);
        this.studentType = TypeStudent;
        this.firstName = Fname;
        this.lastName = Lname;
        this.floorNumber = Floor;
        this.roomNumber = Room;
    }
}
