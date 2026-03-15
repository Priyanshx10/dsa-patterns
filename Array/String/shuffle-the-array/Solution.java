/*
Problem: 1470. Shuffle the Array
Platform: LeetCode
Language: Java
Difficulty: Easy

Approach:
Create a new array of size 2n.
For each i:
ans[2*i] = nums[i]
ans[2*i+1] = nums[i+n]

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++){

            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];

        }

        return ans;
    }
}
