# 1929. Concatenation of Array

## Problem

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` such that:

- `ans[i] = nums[i]`
- `ans[i + n] = nums[i]`

Return the array `ans`.

---

## Example

Input

nums = [1,2,1]

Output

[1,2,1,1,2,1]

Explanation

The result is formed by concatenating the array with itself.

---

## Approach

1. Let `n` be the length of the array.
2. Create a new array `ans` of size `2 * n`.
3. Copy each element of `nums` twice:
   - once at index `i`
   - once at index `i + n`.

---

## Complexity

Time Complexity: O(n)

Space Complexity: O(n)

---

## Java Solution

```java
class Solution {

    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
