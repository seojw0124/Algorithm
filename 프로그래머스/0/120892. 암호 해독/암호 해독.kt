class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        
        for (i in 0 .. cipher.length) {
            if(i != 0 && i % code == 0) answer += cipher[i-1]
        }
        
        return answer
    }
}