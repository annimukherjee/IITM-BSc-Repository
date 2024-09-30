package Week3;

// Implement the code as instructed in the comment, such that it satisfies the given test cases and is in coherence with the given main function

import java.util.*;

class Point {
    private int x, y;

    // implement the constructor and
    // override the toString() and equals() methods
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // // Check if the object is compared with itself
        // if (this == obj) {
        // return true;
        // }

        // Check if the object is an instance of Point
        if (obj instanceof Point) {
            Point other = (Point) obj;
            // Compare the data members and return accordingly
            return this.x == other.x && this.y == other.y;
        }

        return false;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

class PPA2_PointObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        if (p1.equals(p2))
            System.out.println(p1 + "==" + p2);
        else
            System.out.println(p1 + "!=" + p2);
    }
}