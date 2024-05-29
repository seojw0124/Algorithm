class Solution {
    fun solution(numbers: IntArray): Double {
        var sum: Int = 0
        
        numbers.forEach {
            sum += it
        }
        
        val answer = sum.toDouble() / numbers.size
        
        return answer
    }
}