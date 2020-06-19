package collection;

import java.util.*;
import core.Student;

public class StudentList{
	private int current=0;
	private Student[] students;
	
	public StudentList(int size){
		students = new Student[size];
	}
	
	public void addStudent(Student student){
		students[current]=student;
		current++;
	}

	public Enumeration getEnumeration(){
		return new StudentIteratorImpl();
	}
	
	public int getCurrent(){
		return current;
	}
	
	class StudentIteratorImpl implements StudentIterator{
		private int index=-1;
		
		public StudentIteratorImpl(){}
		
		public boolean hasMoreElements(){
			return (index<current);
		}
		
		public Student nextElement(){
			index++;
			return students[index];
		}
	}
}