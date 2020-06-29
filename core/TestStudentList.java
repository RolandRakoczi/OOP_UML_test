package core;

import java.util.*;
import collection.StudentList;

public class TestStudentList{
	
	private static StudentList list;
	
	public static void main(String[] args){
		Student s1 = new Student("Jack",45,"Economics");
		Student s2 = new Student("John",34,"Informatics");
		Student s3 = new Student("Anne",29,"Law");
		Student s4 = new Student("Sara",37,"Arts");
		
		list = new StudentList(0);
		assert(s1.getAge()<110):"The entered age is not a valid age: "+s1.getAge();
		assert(s2.getAge()<110):"The entered age is not a valid age: "+s2.getAge();
		assert(s3.getAge()<110):"The entered age is not a valid age: "+s3.getAge();
		assert(s4.getAge()<110):"The entered age is not a valid age: "+s4.getAge();
		
		System.out.println("Test empty list:");
		TestStudentList.addZeroStudent();
		System.out.println("");
		list = new StudentList(1);
		System.out.println("Test the list with one element:");		
		TestStudentList.addOneStudent(s1);
		System.out.println("");
		list = new StudentList(2);
		System.out.println("Test the list with two elements:");	
		TestStudentList.addTwoStudents(s1,s2);
		System.out.println("");
		list = new StudentList(4);
		System.out.println("Test the list with four elements:");
		TestStudentList.addAll(s1,s2,s3,s4);
	}
	
	public static void addZeroStudent(){
		TestStudentList.listing();
	}
	
	public static void addOneStudent(Student s1){
		try{
		list.addStudent(s1);
		TestStudentList.listing();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}
	
	public static void addTwoStudents(Student s1,Student s2){
		try{
		list.addStudent(s1);
		list.addStudent(s2);
		TestStudentList.listing();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}
	
	public static void addAll(Student s1,Student s2,Student s3,Student s4){
		try{
		list.addStudent(s1);
		list.addStudent(s2);
		list.addStudent(s3);
		list.addStudent(s4);
		TestStudentList.listing();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}
	
	public static void listing(){
		try{
		Enumeration e=list.getEnumeration();		
		while (e.hasMoreElements()){
			System.out.println(e.nextElement().toString());
		}
		}catch(Exception ex){}		
	}
}