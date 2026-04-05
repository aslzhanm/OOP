package lab3.problem4;

import java.util.Vector;
import java.util.Date;

class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public String toString() {
        return super.toString() + ", Bonus: " + bonus;
    }

    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Manager m = (Manager) o;
        return bonus == m.bonus;
    }

    @Override public int compareTo(Employee other) {
        int salaryCompare = Double.compare(this.getSalary(), other.getSalary());

        if (salaryCompare != 0) return salaryCompare;

        if (!(other instanceof Manager)) {
            return 1; // Manager > Employee
        }

        Manager m = (Manager) other;
        return Double.compare(this.bonus, m.bonus);
    }
    
    @Override public Object clone() throws CloneNotSupportedException {
    	Manager cloned = (Manager) super.clone();
    	cloned.team = new Vector<>(team);
    	return cloned;
    }
}
