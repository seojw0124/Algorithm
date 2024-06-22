class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        
        var arr = score.sortedDescending()
        
        for (i in 0 until arr.size step m) {
            if (i + m <= arr.size) {
                val list = arr.slice(i until i+m) 
                answer += list[m - 1] * m     
            }
        }
        
        return answer
    }
}