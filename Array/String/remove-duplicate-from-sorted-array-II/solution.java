/*
Problem: 80. Remove Duplicates from Sorted Array II
Platform: LeetCode
Language: Java
Difficulty: Medium

Approach:
The array is sorted, so duplicates appear next to each other.

We allow each number to appear at most twice.

Use a two-pointer technique:
- Pointer i scans the array
- Pointer k marks the position where the next valid element should be placed

We compare nums[i] with nums[k-2].
If they are different, we place nums[i] at nums[k].

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int removeDuplicates(int[] nums) {

        if(nums.length <= 2){
            return nums.length;
        }
      
        int k = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[k - 2]){
                nums[k] = nums[i];
                k++;
            }
        }
      
        return k;
    }
}
