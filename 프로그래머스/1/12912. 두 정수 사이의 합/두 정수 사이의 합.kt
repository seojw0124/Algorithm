class Solution {
    fun solution(a: Int, b: Int): Long {
        val sum = if (a < b) (a..b).sumOf { it.toLong() }
          else if (a > b) (b..a).sumOf { it.toLong() }
          else a.toLong()
        
        return sum
    }
}