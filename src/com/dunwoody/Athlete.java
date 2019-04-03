package com.dunwoody;

import java.util.Random;

public class Athlete extends Resident {
    public Athlete(String Fname, String Lname, int Floor, int Room){
        super(Fname, Lname, Floor,Room);

        Random rand = new Random();
        this.ID_Number = String.format("%06d",rand.nextInt(1000000) -1);
        this.studentType = "Athlete";
        this.firstName = Fname;
        this.lastName = Lname;
        this.floorNumber = Floor;
        this.roomNumber = Room;
        this.fee = 1200.00;
    }
}
