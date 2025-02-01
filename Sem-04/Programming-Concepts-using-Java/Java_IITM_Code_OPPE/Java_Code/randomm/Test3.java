package randomm;
import java.util.*;

public class Test3 {
    public static boolean balanceCheck(String sequence) {
        // Write your code here

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < sequence.length(); i++) {
            char c = sequence.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()) {
                    return false;
                }
                char ele = stack.peek();

                if ((ele == '(' && c == ')') || (ele == '[' && c == ']') || (ele == '{' && c == '}')) {
                    stack.pop();
                    continue;
                }
                break;

            }

        }
        if (stack.empty()) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> expr_arr = new ArrayList<String>();
        String inp = null;

        do {
            inp = s.nextLine();
            if (!inp.equalsIgnoreCase("Done"))
                expr_arr.add(inp);
        } while (!inp.equalsIgnoreCase("Done"));

        for (String expr : expr_arr) {
            if (balanceCheck(expr)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
        }
    }
}