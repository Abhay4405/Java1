package com.hospital.staff.doctor.salary;

public class Main{
	double amt;
	double tax;
	protected double calculateSalary(double amt, double tax) 
	{
		

	return amt + tax;  	 
	
	}
public static void main(String[] args) {
		
		Main salary = new Main();
		System.out.println(salary.calculateSalary(30000, 3000));
		
	}
	
}

 