class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        
        var index: Int = 0
        
        while (index < t.length - p.length + 1) {
            val str = t.substring(index, index + p.length)
            
            if (str.toLong() <= p.toLong()) answer++
            index++
        }
        
        return answer
    }
}