# 55. Jump Game

## Problem

You are given an integer array `nums`. Each element represents your maximum jump length at that position.

Return `true` if you can reach the last index, otherwise return `false`.

---

## Example 1

Input:
nums = [2,3,1,1,4]

Output:
true

Explanation:
Jump from index 0 → 1 → last index.

---

## Example 2

Input:
nums = [3,2,1,0,4]

Output:
false

Explanation:
You get stuck at index 3.

---

## Approach

Use a greedy approach.

- Maintain a variable `maxReach` representing the farthest index reachable.
- Traverse the array:
  - If current index > maxReach → return false
  - Update maxReach = max(maxReach, i + nums[i])
- If loop completes → return true

---

## Complexity

Time Complexity: O(n)

Space Complexity: O(1)

---

## Pattern

Greedy (Reachability)
