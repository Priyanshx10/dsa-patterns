# 283. Move Zeroes

## Problem
Given an integer array `nums`, move all `0`s to the end of it while maintaining the relative order of the non-zero elements.

The operation must be done **in-place**.

---

## Example

Input:
nums = [0,1,0,3,12]

Output:
[1,3,12,0,0]

---

## Approach

We use the **Two Pointer Compaction Pattern**.

Pointer `i` scans the array.  
Pointer `k` tracks the position where the next non-zero element should be placed.

Steps:

1. Move all non-zero elements to the front.
2. Fill remaining positions with `0`.

---

## Complexity

Time Complexity:
O(n)

Space Complexity:
O(1)

---

## Java Solution

```java
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
