class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val size = answers.size
        
        var arr1 = intArrayOf(1, 2, 3, 4, 5)
        var arr2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var arr3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        
        arr1 = repeatArray(size, arr1)
        arr2 = repeatArray(size, arr2)
        arr3 = repeatArray(size, arr3)
        
        val cnt1 = compareToAnswers(answers, arr1)
        val cnt2 = compareToAnswers(answers, arr2)
        val cnt3 = compareToAnswers(answers, arr3)
        
        var cntArr = intArrayOf(cnt1, cnt2, cnt3)
        
        cntArr.forEachIndexed { index, value ->
            if (value == cntArr.maxOrNull()) {
                answer += index + 1
            }
        }
        
        return answer.sorted().toIntArray()
    }
    
    private fun repeatArray(size: Int, arr: IntArray): IntArray {
        var newArr = intArrayOf()
        repeat (size / arr.size) {
            newArr += arr
        }
        for (i in 0 until size % arr.size) {
            newArr += arr[i]
        }
        return newArr
    }
    
    private fun compareToAnswers(answers: IntArray, arr: IntArray): Int {
        var cnt = 0
        for (i in 0 until answers.size) {
            if (answers[i] == arr[i]) cnt++
        }
        return cnt
    }
}