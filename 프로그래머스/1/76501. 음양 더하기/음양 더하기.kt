class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {       
        for(i in 0 until absolutes.count()) {
            if(!signs[i]) absolutes[i] *= -1
        }
        
        return absolutes.sum()
    }
}