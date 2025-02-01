package Week4;

// Create an abstract class StringOperations that has the following abstract methods:
//     String reverse(String s)
//     int vowelCount(String s)

// Create StringReverse class that extends StringOperations class but defines only String reverse(String s) method. It reverses the string which is passed as parameter and returns the reversed string.
// Create UpdatedStrings class that extends StringReverse class and defines int vowelCount(String s) method.  It counts the vowels in the string which is passed as parameter and returns the count.

import java.util.*;

abstract class StringOperations {
    public abstract String reverse(String s);

    public abstract int vowelCount(String s);
}

abstract class StringReverse extends StringOperations {
    public String reverse(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            str = ch + str;
        }
        return (str);
    }
}

class UpdatedStrings extends StringReverse {
    int k = 0;
    String str = "AEIOUaeiou";

    public int vowelCount(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (s.charAt(i) == str.charAt(j)) {
                    k++;
                }
            }
        }
        return (k);
    }
}

class GA1_StrRevVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        UpdatedStrings str = new UpdatedStrings();
        System.out.println("Reverse of " + s + " is " + str.reverse(s));
        System.out.println("Vowel count of " + s + " is " + str.vowelCount(s));
    }
}