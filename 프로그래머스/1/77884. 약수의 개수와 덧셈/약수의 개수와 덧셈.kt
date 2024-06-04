class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        
        var list = mutableListOf<Int>()
        
        for(num in left..right) {
            var count = (1..num).filter{ num % it == 0 }.count()
            if(count % 2 == 0) list.add(num) else list.add(num * (-1))
        }
        
        for(i in list) {
            answer += i
        }
        
        return answer
    }
}