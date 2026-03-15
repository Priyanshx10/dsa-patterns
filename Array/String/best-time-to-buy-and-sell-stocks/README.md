# 122. Best Time to Buy and Sell Stock II

## Problem

You are given an array `prices` where `prices[i]` represents the price of a stock on day `i`.

You may buy and sell the stock multiple times, but you can hold **only one stock at a time**.

Return the **maximum profit** you can achieve.

---

## Example

Input

prices = [7,1,5,3,6,4]

Output

7

Explanation

Buy at 1 → Sell at 5 → Profit = 4  
Buy at 3 → Sell at 6 → Profit = 3  

Total Profit = 7

---

## Approach

This problem can be solved using a **Greedy strategy**.

Whenever today's price is higher than yesterday's price, we take the profit.

Instead of waiting for one big transaction, we add all small profitable differences.

Example:

[7,1,5,3,6,4]

Profit calculation:

(5 - 1) + (6 - 3) = 7

---

## Complexity

Time Complexity

O(n)

Space Complexity

O(1)

---

## Java Solution

```java
class Solution {

    public int maxProfit(int[] prices) {

        int profit = 0;

        for(int i = 1; i < prices.length; i++){

            if(prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i - 1];
            }

        }

        return profit;
    }
}
