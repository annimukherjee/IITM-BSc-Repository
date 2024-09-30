package randomm;
// // import java.util.*;

// // public class SeriesSum {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         // Fill your code here
// //         int sum = 0;
// //         int subsum = 0;
// //         for (int i = 1; i <= n; i++) {
// //             for (int j = 1; j <= i; j++) {
// //                 subsum = subsum + (int)(Math.pow(j, 2));
// //             }
// //             sum += subsum;
// //             subsum = 0;
// //         }
// //         System.out.println(sum);

// //     }
// // }

// import java.util.*;

// class Employee {
//     String eid;
//     String ename;
//     String eprojects[];
//     // Define all the required methods here

//     Employee(String id, String name, String project[]) {
//         eid = id;
//         ename = name;
//         this.eprojects = new String[3];
//         for (int i = 0; i < 3; i++) {
//             eprojects[i] = project[i];
//         }
//     }

//     Employee(Employee e) {
//         this.eid = e.eid;
//         this.ename = e.ename;
//         this.eprojects = new String[3];
//         for (int i = 0; i < 3; i++) {
//             this.eprojects[i] = e.eprojects[i];
//         }
//     }

//     public void display() {
//         System.out.println("id: " + eid);
//         System.out.println("name: " + ename);
//         System.out.println("projects:");
//         for (int i = 0; i < 3; i++) {
//             System.out.print(eprojects[i] + ":");
//         }
//     }

//     public void mutator() {
//         this.ename = "Mr " + this.ename;
//         this.eprojects[0] = null;
//     }

// }

// public class FClass {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String project[] = { "P001", "P002", "P003" };
//         // Enter the id of employee
//         String id = s.nextLine();
//         // Enter the name of employee
//         String name = s.nextLine();

//         Employee e1 = new Employee(id, name, project);
//         Employee e2 = new Employee(e1);
//         // The copy constructor must copy all the data members.

//         e1.mutator();

//         e2.display();
//     }
// }

import java.util.*;
//Add your code for ComplexNum here

class ComplexNum<T extends Number> {
    private T r, i;

    public ComplexNum(T r, T i) {
        this.r = r;
        this.i = i;
    }

    public ComplexNum<Double> add(ComplexNum<?> c) {
        ComplexNum<Double> dc = new ComplexNum<Double>(0.0, 0.0);

        dc.r = this.r.doubleValue() + c.r.doubleValue();
        dc.i = this.i.doubleValue() + c.i.doubleValue();

        return dc;
    }

    public String toString() {
        return r.doubleValue() + " + " + i.doubleValue() + "i";
    }
}

class FClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}