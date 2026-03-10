/*
Problem: 26. Remove Duplicates from Sorted Array
Platform: LeetCode
Language: Java
Difficulty: Easy

Approach:
Since the array is sorted, duplicates will always be adjacent.
We use a two-pointer technique:
- Pointer i scans the array
- Pointer k tracks the position of the next unique element

Whenever nums[i] != nums[i-1], we store nums[i] at nums[k].

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int removeDuplicates(int[] nums) {
      int k = 1;

      for (int i = 0 ; i < nums.length ; i++){
        if(nums[i] != nums[i-1]){
          nums [k] = nums [i];
          k++;
        }
      }
      return k;
    }
}
      
