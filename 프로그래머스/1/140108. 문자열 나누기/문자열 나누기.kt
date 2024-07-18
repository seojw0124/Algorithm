class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var str = s
        while (str.isNotEmpty()) {
            var xCnt = 1 // x의 개수
            var oCnt = 0 // x 제외 문자 개수
            for (i in 1 until str.length) {
                if (str.elementAt(0) == str.elementAt(i)) xCnt++ else oCnt++
                if (xCnt == oCnt) break
            }
            str = str.substring(xCnt + oCnt)
            answer++
        }
        return answer
    }
}