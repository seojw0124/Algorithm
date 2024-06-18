class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var arr: IntArray = intArrayOf()

        for (i in 0 until score.size) {
            if (i < k) {
                arr += score[i]
                arr.sortDescending()
                answer += arr[i]
            } else {
                if (arr[k-1] < score[i]) arr[k-1] = score[i]
                
                arr.sortDescending()
                answer += arr[k-1]
            }
        }
        
        return answer
    }
}