class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var arr = LongArray(n)
        arr[0] = x.toLong()
        
        for (i in 1 until n) {
            arr[i] = arr[i - 1] + x
        }
        
        return arr
    }
}