package dsa.stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean validParentheses(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        // input have only []{}()
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                Character pop = stack.pop();
                if ((c == ']' && pop != '[') || (c == ')' && pop != '(') || (c == '}' && pop != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static void main() {
        String input = "([)]";
        System.out.println(validParentheses(input));
    }
}
