class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        
        var num = n
        
        while (num >= a) {
            answer += (num / a * b) // 밑에 줄에서 num 재할당되기 전에 먼저 answer에 더해줌.
            num = (num / a * b) + (num % a) // b를 곱한 이유: 3개 주면 2개 줄 때 2를 곱해야 됨.
        }
        
        return answer
    }
}