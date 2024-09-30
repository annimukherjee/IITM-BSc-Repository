package Week3;

// Consider the following Java program. 
// Implement the code as instructed in the comment, such that it satisfies the given test cases and is in coherence with the given main method

import java.util.*;

class Person {
    private String name;
    private long aadharno;

    public Person(String name, long aadharno) {
        this.name = name;
        this.aadharno = aadharno;
    }

    public void print() {
        System.out.println("name : " + name);
        System.out.println("aadharno : " + aadharno);
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String nm, long adhano, double salary) {
        super(nm, adhano);
        this.salary = salary;
    }

    public void print() {
        super.print();
        System.out.println("salary : " + salary);
    }
}

class ContactEmployee extends Employee {
    final private static double hourlyPay = 100.00;
    private int contactHour;

    public ContactEmployee(String nam, long aadhano, double con) {
        super(nam, aadhano, con * hourlyPay);

    }

    public void print() {
        super.print();
    }
}

class GA1_EmployeeInherits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nm1 = sc.nextLine();
        String nm2 = sc.nextLine();
        long adh1 = sc.nextLong();
        long adh2 = sc.nextLong();
        double sal = sc.nextDouble();
        int cont = sc.nextInt();
        Employee[] eArr = new Employee[2];
        eArr[0] = new Employee(nm1, adh1, sal);
        eArr[1] = new ContactEmployee(nm2, adh2, cont);
        for (Employee e : eArr)
            e.print();
    }
}