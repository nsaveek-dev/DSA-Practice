class Solution{
    fun longestSubstringWithoutRepeatingCharacters(s: String) : Int{
        //pwwkew
        //wke
        var max = 0
        val hashSet = mutableSetOf<Char>()
        var left =0

        for (right in 0..s.length-1){
            while(hashSet.contains(s[right]){
                hashSet.remove(s[left])
                    left++
            }
                hashSet.add(s[right])
                max = maxOf(max, right-left+1)
        }
        return max
    }
}