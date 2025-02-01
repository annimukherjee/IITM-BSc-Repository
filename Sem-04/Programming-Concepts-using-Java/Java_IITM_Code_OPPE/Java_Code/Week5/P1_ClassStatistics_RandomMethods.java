package Week5;

// Given a class name as input, complete the Java code to print the count of public and declared methods, fields and constructors in the class. For each method in class ClassStats below, fill in the missing code as described in the comments. Each method takes the class name as input.

import java.lang.reflect.*;
import java.util.*;

class ClassStats {
    public static int getPubMethodCount(String cname) {
        try {
            // add code to return the count of
            // public methods in the given class
            Class c = Class.forName(cname);
            Method[] m = c.getMethods();
            return m.length;

        } catch (Exception e) {
            return -1;
        }
    }

    public static int getAllMethodCount(String cname) {
        try {
            // add code to return the count of all
            // declared methods in the given class
            Class c = Class.forName(cname);
            Method[] m = c.getDeclaredMethods();
            return m.length;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int getPubFieldCount(String cname) {
        try {
            // add code to return the count of
            // public fields (instance variables) in the given class
            Class c = Class.forName(cname);
            Field[] f = c.getFields();
            return f.length;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int getAllFieldCount(String cname) {
        try {
            // add code to return the count of
            // all fields (instance variables) in the given class
            Class c = Class.forName(cname);
            Field[] f = c.getDeclaredFields();
            return f.length;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int getPubContCount(String cname) {
        try {
            // add code to return the count of
            // public constructors in the given class
            Class c = Class.forName(cname);
            Constructor[] constr = c.getConstructors();
            return constr.length;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int getAllContCount(String cname) {
        try {
            // add code to return the count of
            // all constructors in the given class
            Class c = Class.forName(cname);
            Constructor[] constr = c.getDeclaredConstructors();
            return constr.length;
        } catch (Exception e) {
            return -1;
        }
    }
}

class P1_ClassStatistics_RandomMethods {
    public static void main(String[] args) {
        String cname;
        Scanner sc = new Scanner(System.in);
        cname = sc.nextLine();
        System.out.println("Constructor: " +
                ClassStats.getPubContCount(cname) + ", " +
                ClassStats.getAllContCount(cname));
        System.out.println("Fields: " +
                ClassStats.getPubFieldCount(cname) + ", " +
                ClassStats.getAllFieldCount(cname));
        System.out.println("Methods: " +
                ClassStats.getPubMethodCount(cname) + ", " +
                ClassStats.getAllMethodCount(cname));
    }
}