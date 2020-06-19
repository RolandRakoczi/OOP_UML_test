package core;

import java.util.*;
import collection.StudentList;

public class TestStudentList{
	
	public static void main(String[] args){
		Student s1 = new Student("Roli",29,"Economics");
		Student s2 = new Student("Bandi",28,"Informatics");
		Student s3 = new Student("Tamas",29,"Law");
		
		StudentList list = new StudentList(4);
		list.addStudent(s1);
		list.addStudent(s2);
		list.addStudent(s3);		
		
		System.out.println(list.getCurrent());
		
		try{
		Enumeration e=list.getEnumeration();
		
		while (e.hasMoreElements()){
			System.out.println(e.nextElement().toString());
		}
		}catch(Exception ex){}
	}
}