# 88. Merge Sorted Array

## Problem
Merge two sorted arrays `nums1` and `nums2` into `nums1` in sorted order.

## Example

Input:
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3

Output:
[1,2,2,3,5,6]

## Approach

We use a **two pointer technique from the end of the arrays**.

Why from the end?

Because `nums1` already has extra space at the back.

Steps:
1. Start pointers from the last valid elements.
2. Compare elements from both arrays.
3. Insert the larger element at the end.
4. Continue until one array finishes.

## Complexity

Time Complexity:
O(m + n)

Space Complexity:
O(1)

## Code

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
