class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
                    
        var min: Int? = arr.minOrNull()   
        val array = removeItem(arr, min)
              
        return if(arr.size > 1) array else intArrayOf(-1)
    }
    fun removeItem(array: IntArray, number: Int?): IntArray {
        return array.filter { it != number }.toIntArray()
    }
}