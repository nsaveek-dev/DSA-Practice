class Solution {
    fun maxArea(height: IntArray): Int {
        var max = 0
        var l = 0
        var r = height.size-1
        while (r>l){

            val minHeight = minOf(height[l], height[r])
            val distance = r-l
            val area = minHeight*distance
            max = maxOf(max, area)
            if(height[r] > height[l]){
                l++
            } else {
                r--
            }
        }
        return max
    }
}