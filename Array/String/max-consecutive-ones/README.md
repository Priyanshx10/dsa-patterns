# 485. Max Consecutive Ones

## Problem

Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

---

## Example 1

Input

nums = [1,1,0,1,1,1]

Output

3

Explanation

The longest sequence of consecutive 1s is `[1,1,1]`.

---

## Example 2

Input

nums = [1,0,1,1,0,1]

Output

2

---

## Approach

We traverse the array while maintaining two variables:

- `count` → current number of consecutive 1s
- `maxCount` → maximum number of consecutive 1s found so far

Algorithm:

1. Iterate through the array.
2. If the current number is `1`, increase `count`.
3. If it is `0`, reset `count` to `0`.
4. Update `maxCount` using `Math.max()`.

---

## Complexity

Time Complexity: **O(n)**  
Space Complexity: **O(1)**

---

## Java Solution

```java
class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count = 0;
            }

        }

        return maxCount;
    }
}
