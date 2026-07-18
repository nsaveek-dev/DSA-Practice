## Complexity Analysis -
O(N) - We traverse the string once, pushing and popping from the stack as we go. Each push and pop operation is O(1), so the overall time complexity is O(N), where N is the length of the string.
O(N) - In the worst case, we could have all opening brackets, which would require us to store them in the stack. Thus, the space complexity is O(N).

## Solution Approach
We have used a stack to keep track of the opening brackets. 
For every closing bracket encountered, we check if it matches the top of the stack. 
If it does, we pop the stack; if it doesn't, we return false. 
At the end, if the stack is empty, it means all brackets were matched correctly. 
