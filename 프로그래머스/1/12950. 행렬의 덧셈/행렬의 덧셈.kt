class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val row = arr1.size
        val column = arr1[0].size
        
        var answer = Array(row,{IntArray(column,{0})})
        
        for(i in 0 until row) {
            for(j in 0 until column) {
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        
        return answer
    }
}