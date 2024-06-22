class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortDescending()
        var num = 1 
        score.forEach {
            if(num % m == 0) {
               answer += it * m
            }
            num++
        }
        return answer
    }
}