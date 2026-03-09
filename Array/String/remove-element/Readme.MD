# 27. Remove Element

## Problem
Given an array nums and a value val, remove all occurrences of val in-place.

## Example

Input:
nums = [3,2,2,3]
val = 3

Output:
k = 2
nums = [2,2,_,_]

## Approach

We use a two pointer approach.

Pointer i scans the array.
Pointer k stores valid elements.

If nums[i] != val, copy it to nums[k].

## Complexity

Time Complexity: O(n)

Space Complexity: O(1)
