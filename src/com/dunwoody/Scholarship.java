package com.dunwoody;

import java.util.Random;

public class Scholarship extends Resident {
    public Scholarship(String TypeStudent, String Fname, String Lname, int Floor, int Room){
        super(TypeStudent, Fname, Lname, Floor,Room);

        Random rand = new Random();
        this.ID_Number = String.format("%06d",rand.nextInt(1000000) -1);
        this.studentType = TypeStudent;
        this.firstName = Fname;
        this.lastName = Lname;
        this.floorNumber = Floor;
        this.roomNumber = Room;
        this.fee = 100.00;
    }
}
