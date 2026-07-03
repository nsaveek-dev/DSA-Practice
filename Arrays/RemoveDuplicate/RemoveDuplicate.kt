class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if(nums.isEmpty()) return -1
        var firstPointer =0
        for (secondPointer in 1 until nums.size){
            if(nums[secondPointer] != nums[firstPointer]){
                firstPointer++
                nums[firstPointer] = nums[secondPointer]
            }
        }
        return firstPointer+1
    }
}