/*
Problem: 169. Majority Element
Platform: LeetCode
Language: Java
Difficulty: Easy

Approach:
Use the Boyer-Moore Voting Algorithm.

We maintain a candidate and a count.
If count becomes 0, we select a new candidate.
If the current number equals the candidate, increase count.
Otherwise decrease count.

Since the majority element appears more than n/2 times,
it will remain as the final candidate.

Time Complexity: O(n)
Space Complexity: O(1)
*/

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
