class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        
        answer = arr.filter { it != arr.minOrNull() }.toIntArray()
        
        if (answer.count() == 0) answer += -1
        
        return answer
    }
}