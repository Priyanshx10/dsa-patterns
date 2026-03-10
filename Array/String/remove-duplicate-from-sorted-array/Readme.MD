# 26. Remove Duplicates from Sorted Array

## Problem
Given a sorted array `nums`, remove duplicates in-place such that each unique element appears only once.

Return the number of unique elements `k`.

The first `k` elements of the array should contain the unique elements.

---

## Example

Input:
nums = [1,1,2]

Output:
k = 2

Result:
[1,2,_]

---

## Approach

Because the array is **sorted**, duplicates appear next to each other.

We use a **two pointer technique**:

Pointer `i` → scans the array  
Pointer `k` → position for next unique element

If:
