package lab3.problem4;

import java.util.Date;

class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }

    public boolean equals(Object o) {
    	if(!super.equals(o)) return false;
    	
    	Employee second = (Employee) o;
    	
    	return salary == (second.salary) && insuranceNumber.equals(second.insuranceNumber) && hireDate.equals(second.hireDate);
    }
    
    @Override public int compareTo(Employee second) {
    	return Double.compare(salary, second.salary);
    }
    
    @Override public Object clone() throws CloneNotSupportedException{
    	return new Employee(name, salary, (Date) hireDate.clone(), insuranceNumber);
    }
    
    
    
}