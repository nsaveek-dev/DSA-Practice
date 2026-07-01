import java.io.IO.println

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed{ index, value ->
            val rem = target-value
            val anotherIndex = nums.indexOf(rem)
            if(anotherIndex!=index && anotherIndex!=-1)
            {
                return intArrayOf(index, anotherIndex)
            }
        }
        return intArrayOf(-1,-1)
    }
}

fun main() {
    val solution = Solution()
    
    // Test case 1: nums = [2, 7, 11, 15], target = 9
    val result1 = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)
    println("Test 1: nums = [2, 7, 11, 15], target = 9")
    println("Result: [${result1[0]}, ${result1[1]}]\n")
    
    // Test case 2: nums = [3, 2, 4], target = 6
    val result2 = solution.twoSum(intArrayOf(3, 2, 4), 6)
    println("Test 2: nums = [3, 2, 4], target = 6")
    println("Result: [${result2[0]}, ${result2[1]}]\n")
    
    // Test case 3: nums = [3, 3], target = 6
    val result3 = solution.twoSum(intArrayOf(3, 3), 6)
    println("Test 3: nums = [3, 3], target = 6")
    println("Result: [${result3[0]}, ${result3[1]}]\n")
    
    // Test case 4: nums = [1, 2, 3, 4, 5], target = 7
    val result4 = solution.twoSum(intArrayOf(1, 2, 3, 4, 5), 7)
    println("Test 4: nums = [1, 2, 3, 4, 5], target = 7")
    println("Result: [${result4[0]}, ${result4[1]}]\n")
}