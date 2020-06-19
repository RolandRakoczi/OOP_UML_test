package core;

public class Student extends Person{
	private String faculty;
	
	public Student(String name,int age,String f){
		super(name,age);
		this.faculty=f;
	}
	
	public String getFaculty(){
		return faculty;
	}
	
	public void setFaculty(String faculty){
		this.faculty=faculty;
	}
	
	public String toString(){
		String s="The student name is: "+this.name+". He/she is "+this.age+" years old."+" He/she is studying at the faculty of "+this.faculty;
		return s;
	}
}
