/*
Problem: 55. Jump Game
Platform: LeetCode
Language: Java
Difficulty: Medium

Approach:
Use Greedy technique.

Track the farthest index we can reach (maxReach).
If at any point current index > maxReach → return false.

Otherwise update maxReach.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for(int i = 0; i < nums.length; i++){

            // If current index is not reachable
            if(i > maxReach){
                return false;
            }

            // Update the farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}
