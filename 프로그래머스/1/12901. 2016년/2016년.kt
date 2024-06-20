class Solution {
    fun solution(a: Int, b: Int): String {
        
        val days = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val week = arrayOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        
        var total: Int = 0
        
        for (i in 0 until a - 1) {
            total += days[i]
        }
        
        total += b
        
        return week[total % 7]
    }
}