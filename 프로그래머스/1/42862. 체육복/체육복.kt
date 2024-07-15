class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var lostList = (lost.sorted() - reserve.sorted()).toMutableList() 
        var reserveList = (reserve.sorted() - lost.sorted()).toMutableList() 
        var answer = n - lostList.size

        for ( i in lostList) {
            if (reserveList.contains(i - 1)) {
                reserveList.remove(i - 1)
                answer += 1
            }
            else if (reserveList.contains(i + 1)) {
                reserveList.remove(i + 1)
                answer += 1
            }
        }
        return answer
    }
}