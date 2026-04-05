package lab2.problem5;

public class Student extends Person {
	protected String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student of " + major;
    }
    
//  lab3
    @Override
    public void performAction() {
    	System.out.println(name + " пишет диссертацию...");
    }
}
