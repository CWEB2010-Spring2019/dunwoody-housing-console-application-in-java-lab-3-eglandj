package com.dunwoody;

import java.util.Random;

public class WorkStudy extends Resident {
    double hoursWorked;
    public WorkStudy(String TypeStudent, String Fname, String Lname, int Floor, int Room, double Hours){
        super(TypeStudent, Fname, Lname, Floor,Room);

        Random rand = new Random();
        this.ID_Number = String.format("%06d",rand.nextInt(1000000) -1);
        this.studentType = TypeStudent;
        this.firstName = Fname;
        this.lastName = Lname;
        this.floorNumber = Floor;
        this.roomNumber = Room;
        this.hoursWorked = Hours;
        this.fee = 1245.00 - (0.5 * (14.00 * hoursWorked));
    }
}
