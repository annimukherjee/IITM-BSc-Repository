package Week3;

import java.util.Scanner;

// import java.util.*;
class Shape {
    public int area() {
        return 0;
    }

    public int volume() {
        return 0;
    }
}

class Rectangle extends Shape {
    private int w, h;

    // implement Rectangle class
    public Rectangle(int ww, int hh) {
        this.w = ww;
        this.h = hh;
    }

    public int area() {
        return w * h;
    }

}

class Cube extends Shape {
    private int a;

    // implement Cube class
    public Cube(int len) {
        this.a = len;
    }

    public int volume() {
        return a * a * a;
    }
}

class GA2_Shapes_Stuffs {
    private static void caller(Shape s) {
        // check if s is of type Rectangle
        if (s instanceof Rectangle) {
            System.out.println(s.area());
        }
        // check if s is of type Cube
        if (s instanceof Cube) {
            System.out.println(s.volume());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int a = sc.nextInt();
        caller(new Rectangle(w, h));
        caller(new Cube(a));
    }
}
