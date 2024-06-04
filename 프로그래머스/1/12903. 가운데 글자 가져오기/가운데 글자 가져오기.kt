class Solution {
    fun solution(s: String): String {
        val index = s.length / 2
        
        val mid = if(s.length%2 == 0) {
            "${s[index - 1]}${s[index]}"
        } else "${s[index]}"
        
        return mid
    }
}