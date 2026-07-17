## Approach
In this solution we have achieved this using two pointer approach. We have used two pointers to traverse the array and calculate the area based on the height and distance.
We needed to reverse the count from end to start. 
If the height at the left pointer is less than the height at the right pointer, we move the left pointer to the right. Otherwise, we move the right pointer to the left.
We will keep track of the maximum area and return it at the end.
## Complexity Analysis -
Single pass O(N) time complexity
O(1) space complexity
## Point to be noted
If we would compare each pairs of lines, we would have to calculate the area for each pair and keep track 
of the maximum area. This would result in a time complexity of O(n²) as we would have to iterate through all 
pairs of lines. 
Time: O(n²) — nested loop over all pairs
Space: O(1)
## Additional Notes

