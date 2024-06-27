class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0      
        var sumList = mutableListOf<Int>()
        
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                for (k in j + 1 until nums.size) {
                    val sum = nums[i] + nums[j] + nums[k]
                    //if (!sumArr.contains(sum)) sumList.add(sum)
                    sumList.add(sum)
                }
            }
        }
        sumList.distinct()
        var cnt = 0    
        for (num in sumList) {
            cnt = (1..num).filter { num % it == 0 }.count()
            if (cnt == 2) answer++
        }
        return answer
    }
}