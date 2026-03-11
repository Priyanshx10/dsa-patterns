# 189. Rotate Array

## Problem

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

The rotation should be done **in-place**.

---

## Example 1

Input

nums = [1,2,3,4,5,6,7]  
k = 3

Output

[5,6,7,1,2,3,4]

Explanation

rotate 1 step → [7,1,2,3,4,5,6]  
rotate 2 steps → [6,7,1,2,3,4,5]  
rotate 3 steps → [5,6,7,1,2,3,4]

---

## Example 2

Input

nums = [-1,-100,3,99]  
k = 2

Output

[3,99,-1,-100]

---

## Approach

We use the **Array Reversal Algorithm**.

Steps:

1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining `n-k` elements.

Example

Original

[1,2,3,4,5,6,7]

Reverse entire array

[7,6,5,4,3,2,1]

Reverse first `k = 3`

[5,6,7,4,3,2,1]

Reverse remaining

[5,6,7,1,2,3,4]

---

## Complexity

Time Complexity

O(n)

Space Complexity

O(1)

The algorithm rotates the array in-place without using extra memory.

---

## Java Solution

```java
class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end){

        while(start < end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
