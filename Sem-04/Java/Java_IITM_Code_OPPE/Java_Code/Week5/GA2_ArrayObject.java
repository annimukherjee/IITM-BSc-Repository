package Week5;

// Write a Java code that takes as input a positive number (length of an array
// here), and two arrays of that length - one of integers and another of
// strings. The code must also take an integer and a String as input, and print
// the number of occurrences of the integer and the string in the integer array
// and the string array, respectively.

// Format of input:
// Length of the arrays
// Elements in the integer array (in separate lines)
// Element to count in the integer array
// Elements in the string array (in separate lines)
// Element to count in the string array

// Variables used in the code:
// len - represents length of array
// s1 - represents an element to be counted for in Integer array
// s2 - represents an element to be counted for in String array

import java.util.*;

class ArrayExample<T> {
    T[] a;

    public ArrayExample(T[] arr) {
        a = arr;
    }

    public void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public int elementCount(T x) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) {
                count += 1;
            }
        }

        return count;
    }

    // Define constructor(s) as needed
    // Define method display() that print the elements of array a
    // Define method elementCount(T x) that
    // counts the no. of times x is present in the array a
}

public class GA2_ArrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); // Taking input for length of the array
        Integer[] x = new Integer[len];
        for (int i = 0; i < len; i++) {
            x[i] = sc.nextInt(); // Taking input for Integer array
        }

        // Write the code here to create an object obj for Integer array
        ArrayExample<Integer> obj = new ArrayExample<Integer>(x);

        int s1 = sc.nextInt();

        // #################################

        String[] y = new String[len];

        for (int i = 0; i < len; i++) {
            y[i] = sc.next();
        }

        ArrayExample<String> obj1 = new ArrayExample<String>(y);

        String s2 = sc.next(); // Taking input for the value to be counted


        obj.display();
        System.out.println(obj.elementCount(s1));
        obj1.display();
        System.out.println(obj1.elementCount(s2));
    }
}