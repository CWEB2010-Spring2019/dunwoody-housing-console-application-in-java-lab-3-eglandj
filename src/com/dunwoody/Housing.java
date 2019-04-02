package com.dunwoody;

import javax.swing.*;
import java.util.ArrayList;

public class Housing {

	public static void main(String[] args){
		boolean run = false;
		run = Continue(run);

		while (run == true){
			ArrayList<Resident> aList = new ArrayList<>();
			ResidentCreator();
			run = Continue(run);

		}

	}
	public static void ResidentCreator(){
		String[] typePrompt = {"Athlete","Scholarship","Work Study"};
		int typeSelect = JOptionPane.showOptionDialog(null, "Please select student type:", null, 0, 0, null,typePrompt,null);
	}
	public static boolean Continue(boolean run){
		int count = 0;
		String[] beginPrompt = {"Continue","Quit"};
		Boolean[] beginOptions = {true, false};
		if(count == 0){
			int begin = JOptionPane.showOptionDialog(null, "Welcome to the Dunwoody Housing Application",null,0,0,null, beginPrompt,null);
			run = beginOptions[begin];
		}else {
			int begin = JOptionPane.showOptionDialog(null, "Would you like to continue?",null,0,0,null, beginPrompt,null);
			run = beginOptions[begin];
		}
		return run;
	}
}
