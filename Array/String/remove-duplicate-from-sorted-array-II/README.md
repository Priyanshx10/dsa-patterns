# 80. Remove Duplicates from Sorted Array II

## Problem
Given a sorted array `nums`, remove duplicates in-place such that each element appears **at most twice**.

Return the number of elements `k`.

The first `k` elements of the array should contain the final result.

---

## Example

Input:
nums = [1,1,1,2,2,3]

Output:
k = 5

Result:
[1,1,2,2,3,_]

---

## Approach

Because the array is **sorted**, duplicates appear next to each other.

We allow **at most two occurrences** of each number.

We use a **two pointer technique**:

Pointer `i` scans the array.  
Pointer `k` tracks the position of the next valid element.

If:
