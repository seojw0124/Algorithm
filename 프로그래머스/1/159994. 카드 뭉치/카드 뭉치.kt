class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var a = 0
        var b = 0
        for (i in goal) {
            when {
                a < cards1.size && cards1[a] == i -> a++
                b < cards2.size && cards2[b] == i -> b++
                else -> return "No"
            }
        }
        return "Yes"
    }
}
