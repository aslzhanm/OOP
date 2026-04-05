package lab3.problem4;

import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {

        Employee e1 = new Employee("Alice", 5000, new Date(), "123");
        Employee e2 = new Employee("Bob", 4000, new Date(), "456");

        Manager m1 = new Manager("Charlie", 5000, new Date(), "789", 1000);

        System.out.println(e1.compareTo(e2)); // >0

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(m1);

        Collections.sort(list); // по salary
        System.out.println(list);

        Collections.sort(list, new NameComparator());
        System.out.println(list);

        Collections.sort(list, new HireDateComparator());
        System.out.println(list);


        Employee copy = (Employee) e1.clone();
        System.out.println(copy);
    }
}