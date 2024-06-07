class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        if(s.length == 4 || s.length == 6) {
            for(i in 0 until s.length) {
                if(s[i]-'A' >= 0) answer = false
            }
        } else {
            answer = false
        }
        return answer
    }
}