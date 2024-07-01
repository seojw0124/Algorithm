class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {

        fun findDivCnt(n: Int): Int {
            val s = Math.sqrt(n.toDouble()).toInt() // 제곱근
            return (1..s).count { n % it == 0 } * 2 - (if (s * s == n) 1 else 0) // 제곱수면 중복 방지를 위해 -1
        }

        var divArr = IntArray(number) { findDivCnt(it + 1) }
        divArr.forEachIndexed { index, value ->
            if (value > limit) divArr[index] = power
        }

        return divArr.sum()
    }
}