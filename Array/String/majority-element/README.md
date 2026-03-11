# 169. Majority Element

## Problem
Given an array `nums` of size `n`, return the majority element.

The majority element is the element that appears more than ⌊n/2⌋ times.

---

## Example

Input:
nums = [2,2,1,1,1,2,2]

Output:
2

---

## Approach

We use the **Boyer-Moore Voting Algorithm**.

Steps:

1. Maintain a `candidate` and `count`.
2. If `count == 0`, choose the current element as the candidate.
3. If the current number equals the candidate → increase count.
4. Otherwise → decrease count.

Since the majority element appears more than `n/2` times,
it will remain the final candidate.

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

    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for(int num : nums){

            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            }
            else{
                count--;
            }

        }

        return candidate;
    }
}
