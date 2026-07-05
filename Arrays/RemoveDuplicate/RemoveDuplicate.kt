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

    /**
     * for Each elements, maximum two instances allowed
     */
    fun removeDuplicates(nums: IntArray) : Int {
        if(nums.isEmpty()) return -1
        var firstPointer = 2
        for (secondPointer in 2 until nums.size){
            if(nums[secondPointer] != nums[firstPointer-2]){
                nums[firstPointer] = nums[secondPointer]
                firstPointer++
            }
        }
        return firstPointer
    }
}

