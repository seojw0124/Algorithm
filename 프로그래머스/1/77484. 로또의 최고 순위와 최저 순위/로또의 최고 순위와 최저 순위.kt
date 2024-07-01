class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        val arr = intArrayOf(6, 5, 4, 3, 2)
        
        var answerCnt = 0
        var zeroCnt = 0
        
        for (i in lottos) {
            if(i == 0) {
                zeroCnt++
                continue
            }
            for (j in win_nums) {
                if (i == j) answerCnt++
            }
        }
        
        val max = if(zeroCnt + answerCnt == 0 || zeroCnt + answerCnt == 1) 6 else arr.indexOf(zeroCnt + answerCnt) + 1
        val min = if(answerCnt == 0 || answerCnt == 1) 6 else arr.indexOf(answerCnt) + 1 
        
        return intArrayOf(max, min)
    }
}