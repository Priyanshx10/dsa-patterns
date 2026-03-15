/*
Problem: 485. Max Consecutive Ones
Platform: LeetCode
Language: Java
Difficulty: Easy

Approach:
Traverse the array while counting consecutive 1s.

If the current element is 1:
    increase the current streak.

If the current element is 0:
    reset the streak to 0.

Track the maximum streak during traversal.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count = 0;
            }

        }

        return maxCount;
    }
}
