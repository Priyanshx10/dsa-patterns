# 412. Fizz Buzz

## Problem
Given an integer n, return a string array answer (1-indexed) where:

- answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
- answer[i] == "Fizz" if i is divisible by 3.
- answer[i] == "Buzz" if i is divisible by 5.
- answer[i] == i (as a string) if none of the above conditions are true.

---

## Approach
- Iterate from 1 to n
- Check divisibility:
  - First check for 3 and 5
  - Then 3
  - Then 5
- Store result in ArrayList

---

## Complexity
Time: O(n)  
Space: O(n)

---

## Pattern
Simulation + Modulo Arithmetic
