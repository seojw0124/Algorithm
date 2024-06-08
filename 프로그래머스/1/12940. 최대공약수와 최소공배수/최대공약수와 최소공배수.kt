class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        
        var nArr = intArrayOf()
        var mArr = intArrayOf()
        var nmArr = intArrayOf()
        
        for (i in 1..n) {
            if (n % i == 0) nArr += i
        }
        for (j in 1..m) {
            if (m % j == 0) mArr += j
        }
        for (k in 1..(n * m)) {
            if ((n * m) % k == 0 && k >= 0 && k >= m) nmArr += k
        }
        
        for (a in (nArr.size - 1) downTo 0) {
            if (mArr.contains(nArr[a])) {
                answer += nArr[a]
                break
            }
        }
        
        for (b in nmArr) {
            if (b % n == 0 && b % m == 0) {
                answer += b
                break
            }
        }
        
        return answer
    }
}