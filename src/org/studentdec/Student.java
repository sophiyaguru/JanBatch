package org.studentdec;
//Access Specifier  class className
public class Student {

	private void studentName() {
		System.out.println("ajithkumar");
		System.out.println("chan");
		System.out.println("sophi");
	}
	private void studentId() {
		System.out.println("456");
		System.out.println("100");
		System.out.println("200");
		System.out.println("300");
	}
	//main method
	public static void main(String[] args){
		
		//objects
		
		Student s=new Student();
		
		//method call
		
		s.studentName();
		s.studentId();
		
		
			
	}
	
}
