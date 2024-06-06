class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var totalPrice: Long = 0
        
        for(cnt in 1..count) {
            totalPrice += price * cnt        
        }
        
        return if(totalPrice > money) totalPrice - money else 0
    }
}