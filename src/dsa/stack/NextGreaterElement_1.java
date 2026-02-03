package dsa.stack;

import java.util.Arrays;
import java.util.Stack;

// Given an array of integers, for each element find the next greater element to its right. If no greater element exists, return -1
/*
Example
Input: [4, 5, 2, 25]
Output: [5, 25, 25, -1]
For 4 → next greater is 5
For 5 → next greater is 25
For 2 → next greater is 25
For 25 → no greater → -1
 */
public class NextGreaterElement_1 {

    public static int[] nextGreaterElement(int[] num) {
        int length = num.length;
        int[] result = new int[length];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && num[i] > num[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = num[i];
            }
            stack.push(i);
        }
        return result;
    }

    // Time: O(n) (each element pushed/popped once).
    // Space: O(n) (stack + result array).
    static void main() {
        int[] nums = {4, 5, 2, 25};
        System.out.println(Arrays.toString(nextGreaterElement(nums)));
    }
}
