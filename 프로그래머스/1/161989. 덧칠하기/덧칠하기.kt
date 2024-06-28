class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var end = 0
        for (i in section) {
            if (i > end){
                end = i + m - 1
                answer++
            }
        }
        return answer
    }
}