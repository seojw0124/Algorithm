class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        
        var bigList = mutableListOf<Int>()
        var smallList = mutableListOf<Int>()
        
        for (i in 0 until sizes.size) {
            if (sizes[i][0] > sizes[i][1]) {
                bigList.add(sizes[i][0])
                smallList.add(sizes[i][1])
            } else {
                bigList.add(sizes[i][1])
                smallList.add(sizes[i][0])
            }
        }
        
        answer = bigList.maxOrNull()!! * smallList.maxOrNull()!!
        
        return answer
    }
}