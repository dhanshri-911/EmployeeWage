package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empIsPresent = (int) (Math.floor(Math.random() * 10) % 2);
		if (empIsPresent == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}

	}

}
