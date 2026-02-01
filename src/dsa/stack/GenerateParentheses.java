package dsa.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        String output = "";
        int open = 0;
        int close = 0;
        backtrack(result, output, open, close, n);
        return result;
    }

    public static void backtrack(List<String> result, String output, int open, int close, int max) {
        if (output.length() == max * 2) {
            result.add(output);
            return;
        }
        if (open < max) {
            backtrack(result, output + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, output + ")", open, close + 1, max);
        }
    }

    static void main() {
        System.out.println(generateParentheses(2));
    }
}
