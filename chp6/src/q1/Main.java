package q1;

import java.lang.ProcessHandle.Info;

abstract class School{
	
	abstract void schoolInfo1(String schName, int floors) ;
	 void schoolInfo2( String areaName) {
		 System.out.println(areaName);
		 
	}
}

class Student extends School{

	@Override
	void schoolInfo1(String schName, int floors) {
		System.out.println(schName + " " + floors);
	}
	}

interface SDAC{
	void Info1(String courseName , int duration);
	void Info2(String area);
}

class Abhay implements SDAC{

	@Override
	public void Info1(String courseName, int duration) {
		System.out.println(courseName +" "+ duration +"Years");
	}

	@Override
	public void Info2(String area) {
		System.out.println(area);
	}
	
}


public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.schoolInfo1("Mother Marry's", 4);
		student.schoolInfo2("Rahul Park");
		Abhay abhay = new Abhay();
		abhay.Info1("Full Stack", 1);
		abhay.Info2("Borivali");
	}
}
