class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val array = arr.filter{it%divisor == 0}.sorted().toIntArray()
        return if(array.count() > 0) array else intArrayOf(-1)
    }
}