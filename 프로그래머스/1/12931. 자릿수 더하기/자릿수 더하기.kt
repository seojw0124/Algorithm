class Solution {
    fun solution(n: Int): Int {
        var sum = 0
        var tempN = n
        
        while(tempN != 0) {
            sum += tempN % 10
            tempN /= 10
        }
        
        return sum
    }
}