# 1470. Shuffle the Array

## Problem

Given an array `nums` consisting of `2n` elements in the form:

[x1,x2,...,xn,y1,y2,...,yn]

Return the array in the form:

[x1,y1,x2,y2,...,xn,yn]

---

## Example

Input

nums = [2,5,1,3,4,7]  
n = 3

Output

[2,3,5,4,1,7]

---

## Approach

1. Create a new array of size `2n`.
2. For each index `i`:
   - `ans[2*i] = nums[i]`
   - `ans[2*i+1] = nums[i+n]`

---

## Complexity

Time Complexity: O(n)

Space Complexity: O(n)

---

## Java Solution

```java
class Solution {

    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++){

            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];

        }

        return ans;
    }
}
