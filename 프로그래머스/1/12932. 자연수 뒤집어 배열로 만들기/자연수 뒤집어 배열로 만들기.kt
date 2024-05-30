class Solution {
    fun solution(n: Long): IntArray {    
        var tempN = n
        var count = n.toString().length ?: 0
        var arr = IntArray(count)
        var i = 0
        
        while(count > 0) {
            arr[i] = (tempN % 10).toInt()
            tempN /= 10
            i += 1
            count -= 1
        }
        
        return arr
    }
}