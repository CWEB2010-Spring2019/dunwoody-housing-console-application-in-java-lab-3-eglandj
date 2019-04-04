package com.dunwoody;

import javax.swing.*;
import java.util.*;

public class Housing {


	public static void main(String[] args){
		ArrayList<Resident> aList = new ArrayList<>();
		int count = 0;
		boolean run;
		run = Continue(count);

		while (run == true){
			count++;
			aList.add(ResidentCreator());
			run = Continue(count);
		}
		System.out.println();
		Map<String, List<Resident>> groupedStudents = new HashMap<>();
		for (Resident student: aList) {
			String key = student.studentType;
			if (groupedStudents.get(key) == null) {
				groupedStudents.put(key, new ArrayList<>());
			}
			groupedStudents.get(key).add(student);
		}
		Set<String> groupedStudentsKeySet = groupedStudents.keySet();
		for (String studentType: groupedStudentsKeySet) {
			List<Resident> stdnts = groupedStudents.get(studentType);
			for (Resident n : stdnts) {

				System.out.println(n.toString());
			}
		}
	}
	public static Resident ResidentCreator(){
		Resident newResident;
		String[] typePrompt = {"Athlete","Scholarship","Work Study"};
		int typeSelect = JOptionPane.showOptionDialog(null, "Please select student type:", null, 0, JOptionPane.INFORMATION_MESSAGE, null,typePrompt,null);
		String studentType = typePrompt[typeSelect];

		String firstName = JOptionPane.showInputDialog(null, "Students First Name");
		String lastName = JOptionPane.showInputDialog(null, "Students Last Name");

		if(studentType.equals("Athlete")){
			Integer[] floorOptions = {4,5,6};
			Integer[] roomOptions = {1,2,3,4,5,6,7,8,9};
			int floorSelect = JOptionPane.showOptionDialog(null,"Select a floor",null,0,JOptionPane.INFORMATION_MESSAGE,null,floorOptions,null);
			int floor = floorOptions[floorSelect];
			int roomSelect = JOptionPane.showOptionDialog(null,"Select a room",null,0,JOptionPane.INFORMATION_MESSAGE,null,roomOptions,null);
			int room = roomOptions[roomSelect];
			int roomNumber = Integer.parseInt(Integer.toString(floor) + Integer.toString(room));
			newResident = new Athlete(firstName,lastName,floor,roomNumber);
		}else if (studentType.equals("Scholarship")){
			Integer[] floorOptions = {7,8};
			Integer[] roomOptions = {1,2,3,4,5,6,7,8,9};
			int floorSelect = JOptionPane.showOptionDialog(null,"Select a floor",null,0,JOptionPane.INFORMATION_MESSAGE,null,floorOptions,null);
			int floor = floorOptions[floorSelect];
			int roomSelect = JOptionPane.showOptionDialog(null,"Select a room",null,0,JOptionPane.INFORMATION_MESSAGE,null,roomOptions,null);
			int room = roomOptions[roomSelect];
			int roomNumber = Integer.parseInt(Integer.toString(floor) + Integer.toString(room));
			newResident = new Scholarship(firstName,lastName,floor,roomNumber);
		}else if (studentType.equals("Work Study")){
			Integer[] floorOptions = {1,2,3};
			Integer[] roomOptions = {1,2,3,4,5,6,7,8,9};
			int floorSelect = JOptionPane.showOptionDialog(null,"Select a floor",null,0,JOptionPane.INFORMATION_MESSAGE,null,floorOptions,null);
			int floor = floorOptions[floorSelect];
			int roomSelect = JOptionPane.showOptionDialog(null,"Select a room",null,0,JOptionPane.INFORMATION_MESSAGE,null,roomOptions,null);
			int room = roomOptions[roomSelect];
			int roomNumber = Integer.parseInt(Integer.toString(floor) + Integer.toString(room));
			double HoursWorked = Double.parseDouble(JOptionPane.showInputDialog(null, "Monthly Hours Worked"));
			newResident = new WorkStudy(firstName,lastName,floor,roomNumber, HoursWorked);
		}else{
			newResident = null;
		}
		return newResident;
	}
	public static boolean Continue(int count){
		boolean run;
		String[] beginPrompt = {"Continue","Quit"};
		Boolean[] beginOptions = {true, false};
		//JOptionPane.showMessageDialog(null, Integer.toString(count));
		if(count == 0){
			int begin = JOptionPane.showOptionDialog(null, "Welcome to the Dunwoody Housing Application",null,0,JOptionPane.INFORMATION_MESSAGE,null, beginPrompt,null);
			run = beginOptions[begin];
		}else {
			int begin = JOptionPane.showOptionDialog(null, "Would you like to continue?",null,0,JOptionPane.INFORMATION_MESSAGE,null, beginPrompt,null);
			run = beginOptions[begin];
		}
		return run;
	}
}
