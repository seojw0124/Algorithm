class Solution {
    fun solution(n: Int): String {
        var answer = ""
        answer = "수박".repeat(n / 2) + if(n % 2 != 0) "수" else ""
        return answer
    }
}