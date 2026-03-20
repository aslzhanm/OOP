package pr4.problem4;

import java.util.*;


public class Student implements Comparable<Student> {
	String name;
	private double gpa;
	
	public Student(String n, double g){
		this.name = n;
		this.gpa = g;
	}
	
	public int compareTo(Student other) {
		return Double.compare(this.gpa, other.gpa);
	
	}
	
	public String toString() {
		return "name: " + name + " gpa: " + gpa + "\n";
	}

}
