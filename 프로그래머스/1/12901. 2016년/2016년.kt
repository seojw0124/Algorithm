class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        
        val days: IntArray = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        
        var monthDays: Int = 0
        
        if (a > 1) {
            for (i in 0 until a - 1) {
                monthDays += days[i]
            }
        }
        
        val totalDays = monthDays + b
        
        answer = when (totalDays % 7) {
            0 -> "THU"
            1 -> "FRI"
            2 -> "SAT"
            3 -> "SUN"
            4 -> "MON"
            5 -> "TUE"
            else -> "WED"
        }
        
        return answer
    }
}