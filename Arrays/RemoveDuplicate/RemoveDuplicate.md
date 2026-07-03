## Point to be noted
In this solution we have achieved this using two pointer approach. We have used two pointers to traverse the array and remove duplicates in place. The first pointer `i` keeps track of the position of the last unique element, while the second pointer `j` scans through the array. When a new unique element is found, it is placed at the position `i + 1`, and `i` is incremented. This way, we maintain the order of elements and remove duplicates without using extra space.
However, there are other ways to solve this problem, such as using a HashSet to track seen elements, but that would require additional space. The two-pointer approach is optimal for this problem as it achieves O(N) time complexity and O(1) space complexity.

## Complexity Analysis -
Single pass O(N) time complexity
O(1) space complexity

## Additional Notes
What if the interviewer asks that each of the elements in the array can be repeated at most twice? How would you solve it?
Will solve next