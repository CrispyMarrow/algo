package warmup;
/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * There is one clarification that you might want to know:
 * - there might be duplicates and counting the same element twice is NOT ok (might impact some solutions)
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 */

public class Solution {
    public int[] TwoSum(int[] numbers, int target) {
        int first = 1;
        int last = numbers.Length - 1;
        
        while ( first < last ) {
            int sum = numbers[first] + numbers[last];
            if ( sum == target ) { return new int[]{first++, last++}; }
            
            if( sum > target ) {
                last--;
            } else {
                first++;
            }                        
        }
        
        return new int[]{0,0};
    }
}
