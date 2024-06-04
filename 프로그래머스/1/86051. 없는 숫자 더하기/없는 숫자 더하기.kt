class Solution {
    fun solution(numbers: IntArray): Int {
        var arr = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        
        for(i in numbers) {
            if(i != 0) arr.remove(i)
        }
        
        return arr.sum()
    }
}