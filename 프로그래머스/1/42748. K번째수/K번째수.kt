class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        
        for (index in 0 until commands.size) {
            val i = commands[index][0] - 1
            val j = commands[index][1] - 1
            val k = commands[index][2] - 1
            
            answer += array.slice(i..j).sorted()[k]
        }
        
        return answer
    }
}