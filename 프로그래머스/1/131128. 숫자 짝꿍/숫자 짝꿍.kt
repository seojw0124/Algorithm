

class Solution {
    fun solution(X: String, Y: String): String {
        val xCnt = X.groupingBy { it }.eachCount()
        val yCnt = Y.groupingBy { it }.eachCount()

        val commonKeys = xCnt.keys.intersect(yCnt.keys)
        
        if (commonKeys.isEmpty()) return "-1"
        
        val str = StringBuilder()
        
        for (key in commonKeys.sortedDescending()) {
            val minCnt = minOf(xCnt[key]!!, yCnt[key]!!)
            repeat(minCnt) { str.append(key) }
        }
        
        if (str.isEmpty() || str[0] == '0') return "0"

        return str.toString()
    }
}