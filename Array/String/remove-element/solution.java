/*
Problem: 27. Remove Element
Platform: LeetCode
Difficulty: Easy

Approach:
Use a two-pointer technique.
One pointer scans the array, and another pointer stores
valid elements (elements not equal to val).

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
