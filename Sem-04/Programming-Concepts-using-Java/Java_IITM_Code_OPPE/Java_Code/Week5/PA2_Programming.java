package Week5;

import java.util.Scanner;

class ConvertArrays {
    public Double doubleArr[] = new Double[3];
    public Integer intArr[] = new Integer[3];
    public int x = 0, y = 0, z = 0;

    public void convert(String[] arr) {
        // loop through the arr and store each element
        // in the appropriate array
        for (String elem : arr) {
            if (elem.contains(".")) {
                doubleArr[x] = Double.parseDouble(elem);
                x++;
            } else {
                intArr[y] = Integer.parseInt(elem);
                y++;
            }
        }

    }

    public <T> void display(T[] arr) {
        for (T elements : arr)
            System.out.print(elements + " ");
        System.out.println();
    }
}

public class PA2_Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr[] = new String[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }
        ConvertArrays conArrays = new ConvertArrays();
        conArrays.convert(arr);
        System.out.println("===After conversion Arrays===");
        conArrays.display(conArrays.doubleArr);
        conArrays.display(conArrays.intArr);
    }
}
