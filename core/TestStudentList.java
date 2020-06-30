package core;

import java.util.*;
import java.io.*;
import collection.StudentList;

public class TestStudentList{
	
	private static StudentList list;
	private static Student s1;
	private static Student s2;
	private static Student s3;
	private static Student s4;
	
	public static void main(String[] args){
		s1 = new Student("Jack",45,"Economics");
		s2 = new Student("John",34,"Informatics");
		s3 = new Student("Anne",29,"Law");
		s4 = new Student("Sara",37,"Arts");
		TestStudentList.test();
	}
	
	public static void test(){
		System.out.println("1: Testing StudentList object with different number of elements");
		System.out.println("2: Testing addStudent() method");
		System.out.println("3: Testing nextElement() method");
		System.out.println("4: Verify the student's age");
		System.out.println("0: Skip testing");
		int i=-1;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try{
				i = Integer.parseInt(reader.readLine());
			}catch(IOException e){
				System.out.println("IOException");
				System.exit(74);
			}catch(NumberFormatException e){
				System.out.println("Invalid format");
				System.exit(65);
			}
				switch(i){
					case 1:
						testDifferentNumberOfElements();
						break;
					case 2:
						testAddStudent();
						break;
					case 3:
						testNextElement();
					case 4:
						testStudentAge();
						break;
					case 0:
						addAllStudents();
						break;
		}				
	}
	
	public static void testDifferentNumberOfElements(){
		TestStudentList.addZeroStudent();
		TestStudentList.addOneStudent();
		TestStudentList.addTwoStudents();
		TestStudentList.addAllStudents();
	}
	
	public static void testStudentAge(){
		assert(s1.getAge()<110):s1.getName()+"'s age is not a valid age: "+s1.getAge();
		assert(s2.getAge()<110):s2.getName()+"'s age is not a valid age: "+s2.getAge();
		assert(s3.getAge()<110):s3.getName()+"'s age is not a valid age: "+s3.getAge();
		assert(s4.getAge()<110):s4.getName()+"'s age is not a valid age: "+s4.getAge();
	}
	
	public static void addZeroStudent(){
		System.out.println("Test empty list:");
		try{
		list = new StudentList(0);		
		TestStudentList.listing();
		}catch(ArrayIndexOutOfBoundsException e){
			System.exit(1);
		}finally{
		System.out.println("");
		}
	}
	
	public static void addOneStudent(){
		System.out.println("Test the list with one element:");	
		try{
		list=new StudentList(1);
		list.addStudent(s1);
		TestStudentList.listing();
		}catch(ArrayIndexOutOfBoundsException e){
			System.exit(1);
		}finally{
		System.out.println("");
		}
	}
	
	public static void addTwoStudents(){
		System.out.println("Test the list with two elements:");	
		try{
			list=new StudentList(2);
			list.addStudent(s1);
			list.addStudent(s2);
			TestStudentList.listing();
		}catch(ArrayIndexOutOfBoundsException e){
			System.exit(1);
		}finally{
			System.out.println("");
		}
	}
	
	public static void addAllStudents(){
		System.out.println("Test the list with four elements:");
		try{
			list=new StudentList(4);
			list.addStudent(s1);
			list.addStudent(s2);
			list.addStudent(s3);
			list.addStudent(s4);
			TestStudentList.listing();
		}catch(ArrayIndexOutOfBoundsException e){
			System.exit(1);
		}finally{
			System.out.println("");
		}
	}
	
	public static void testAddStudent(){
		list = new StudentList(1);
		list.addStudent(s1);
		if (s1.equals(list.getEnumeration().nextElement())){
			System.out.println("addStudent() method is working good");
		} else {
			System.out.println("The added object is different than the initial object");
			System.exit(1);
		}
	}
	
	public static void testNextElement(){
		list = new StudentList(2);
		list.addStudent(s1);
		list.addStudent(s2);
		Student s=new Student("1",1,"1");
		try{
			Enumeration e=list.getEnumeration();		
			while (e.hasMoreElements()){
				s=(Student)e.nextElement();				
			}
			if (s.toString().equals(s2.toString())){
				System.out.println("nextElement() method is working good");
			} else {
				System.out.println("The added object is different than the initial object");
				System.exit(1);
			}
		}catch(ArrayIndexOutOfBoundsException ex){
			System.exit(1);
		}
	}
	
	public static void listing(){
		try{
			Enumeration e=list.getEnumeration();		
			while (e.hasMoreElements()){
				System.out.println(e.nextElement().toString());
			}
		}catch(Exception ex){
			System.exit(1);
		}		
	}
}