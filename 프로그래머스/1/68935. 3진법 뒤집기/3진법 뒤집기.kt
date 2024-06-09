import kotlin.math.pow

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        val reversedTrit = reverseTrit(n)
        
        val length = reversedTrit.length
        
        for (i in length - 1 downTo 0) {
            answer += ((reversedTrit[i] - '0') * 3.0.pow(length-1-i)).toInt()
        }
        
        return answer
    }
    
    fun reverseTrit(decimal: Int): String {
        var n = decimal
        var trit = ""
        
        while (n > 0) {
            trit += (n % 3).toString()
            n /= 3
        }
        
        return trit
    }

    
// 굳이 3진법 만들고 다시 앞뒤 반전할 필요 없이 바로 앞뒤 반전을 하면 된다.(위에 처럼)
//     fun reverseTrit(decimal: Int): String {
//         var count: Int = 0
//         var trit: Int = 0
        
//         var n = decimal
        
//         while (n > 3) {
//             trit += ((n % 3) * 10.0.pow(count)).toInt()
//             n /= 3
//             count ++
//         }
//         trit += (n * 10.0.pow(count)).toInt()
        
//         return trit.toString().reversed()
//     }
}