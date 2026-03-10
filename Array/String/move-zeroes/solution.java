/*
Problem: 283. Move Zeroes
Platform: LeetCode
Language: Java
Difficulty: Easy

Approach:
Use the two-pointer compaction technique.

Pointer i scans the array.
Pointer k tracks the position where the next non-zero element should be placed.

Step 1: Move all non-zero elements to the front.
Step 2: Fill the remaining positions with zero.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void moveZeroes(int[] nums) {

        int k = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }

        }

        while(k < nums.length){
            nums[k] = 0;
            k++;
        }

    }
}
