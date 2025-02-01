package Week2;

// Complete the definition of the given class by defining appropriate constructors and member functions such that it is in coherence with the given main method and produce the required output

import java.util.*;

class Employee {
    String eid;
    String ename;
    String eprojects[];
    // Define all the required methods here

    Employee(String id, String name, String project[]) {
        eid = id;
        ename = name;
        this.eprojects = new String[3];
        for (int i = 0; i < 3; i++) {
            eprojects[i] = project[i];
        }
    }

    Employee(Employee e) {
        this.eid = e.eid;
        this.ename = e.ename;
        this.eprojects = new String[3];
        for (int i = 0; i < 3; i++) {
            this.eprojects[i] = e.eprojects[i];
        }
    }

    public void display() {
        System.out.println("id:" + eid);
        System.out.println("name:" + ename);
        System.out.println("projects:");
        for (int i = 0; i < 3; i++) {
            System.out.print(eprojects[i] + ":");
        }
    }

    public void mutator() {
        this.ename = "Mr " + this.ename;
        this.eprojects[0] = null;
    }

}

public class GA_3EmployeeProj {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String project[] = { "P001", "P002", "P003" };
        // Enter the id of employee
        String id = s.nextLine();
        // Enter the name of employee
        String name = s.nextLine();

        Employee e1 = new Employee(id, name, project);
        Employee e2 = new Employee(e1);
        // The copy constructor must copy all the data members.

        e1.mutator();

        e2.display();
    }
}

public class j {

}
