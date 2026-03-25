# 380. Insert Delete GetRandom O(1)

## Problem
Design a data structure that supports:

- insert
- remove
- getRandom

All in O(1) time.

---

## Approach
Use:

- ArrayList → store elements
- HashMap → value → index

Remove trick:
Swap with last element, then remove.

---

## Complexity
Time: O(1)
Space: O(n)

---

## Pattern
HashMap + ArrayList (Index Mapping)
