## Edge Cases - 
Duplicate values in the array
let's say we have an array [3,3], target = 6, we should return [0,1] as the answer.
nums.indexOf(rem) always returns the first index of the value, 
anotherIndex == nums.indexOf(rem) will be true
but this is skipped here.Thus will return [-1,-1] which is wrong. 


## Complexity Analysis -
O(n2) - indexOf() is O(n) and we are calling it inside a loop that runs n times.

## Solution
Check Hashmap solution for O(n) time complexity and O(n) space complexity.