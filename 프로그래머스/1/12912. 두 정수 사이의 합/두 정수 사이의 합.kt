class Solution {
    fun solution(a: Int, b: Int): Long {
        var sum: Long = 0
        sum = if (a < b) (a.toLong()..b.toLong()).sum()
        else if (a > b) (b.toLong()..a.toLong()).sum()
        else a.toLong()
        
        return sum.toLong()
    }
}