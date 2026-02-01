package das.leet;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Time Complexity: O(n²)
    // No extra data structures are used (just a couple of integers and the return array of size 2).
    // Therefore, space complexity = O(1) (constant space).
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                sum = nums[i] + nums[j];
                if (target == sum) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Works efficiently for large arrays (up to 10⁴ elements as per constraints).
    public int[] twoSumHashMap(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        // nums = 2,3,4
        // target = 6
        for (int i = 0; i < len; i++) {
            int res = target - nums[i]; // I-4, II-3, III-2
            if (map.containsKey(res)) { // III-true
                return new int[]{map.get(res), i}; // 0,2
            }
            map.put(nums[i], i); // I-[2,0], II-[(2,0),(3,1)]
        }

        return new int[]{};
    }

   // So the brute force approach is space-efficient (O(1)), but time-inefficient (O(n²)).
   // The HashMap approach flips that trade-off: faster time, but more memory.
}
