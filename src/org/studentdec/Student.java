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
