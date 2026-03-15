/*
Problem: 122. Best Time to Buy and Sell Stock II
Platform: LeetCode
Language: Java
Difficulty: Medium

Approach:
We use a greedy strategy.

If the price today is greater than yesterday, we take the profit.
This means we capture every increasing price difference.

Instead of waiting for one big transaction, we sum all small profits.

Example:
prices = [7,1,5,3,6,4]

Profit:
(5 - 1) + (6 - 3) = 7

Time Complexity: O(n)
Space Complexity: O(1)
*/

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
