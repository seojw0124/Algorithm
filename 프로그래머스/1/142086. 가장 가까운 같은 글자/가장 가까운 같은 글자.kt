class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = IntArray(s.length) {-1}
        
        for (i in s.length - 1 downTo 0) {
            for (j in i - 1 downTo 0) {
                if (s[i] == s[j]) {
                    answer[i] = i - j
                    break
                }
            }
        }
        
        return answer
    }
}