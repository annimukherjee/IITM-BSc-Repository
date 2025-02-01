package Week3;

import java.util.*;

// Write a class named Calculator that has the following methods:
//     sum(double a, double b) that prints the value of a + b
//     subtraction(double a, double b) that prints the value of a - b
//     multiply(double a, double b) that prints the value of a * b
//     division(double a, double b) that prints the value of a / b
// Write another class named UpdatedCalculator that inherits all the methods of Calculator and also has the following method:
//     remainder(double a, double b) that prints the value of a % b

class Calculator {
    // Fill the code
    public void sum(double a, double b) {
        System.out.println(a + b);
    }

    public void subtraction(double a, double b) {
        System.out.println(a - b);
    }

    public void multiply(double a, double b) {
        System.out.println(a * b);
    }

    public void division(double a, double b) {
        System.out.println(a / b);
    }
}

class UpdatedCalculator extends Calculator {
    // Fill the code
    public void remainder(double a, double b) {
        System.out.println(a % b);
    }

}

public class PPA1_CalculatorCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        Calculator c = new Calculator();
        c.sum(n1, n2);
        c.subtraction(n1, n2);
        c.multiply(n1, n2);
        c.division(n1, n2);
        UpdatedCalculator uc = new UpdatedCalculator();
        uc.remainder(n1, n2);
    }

}