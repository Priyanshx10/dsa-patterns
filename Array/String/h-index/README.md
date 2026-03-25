# 274. H-Index

## Problem
Find the maximum h such that the researcher has at least h papers with at least h citations.

---

## Approach
1. Sort the citations array
2. For each index i:
   h = n - i
3. If citations[i] >= h → return h

---

## Complexity
Time: O(n log n)
Space: O(1)

---

## Pattern
Sorting + Counting
