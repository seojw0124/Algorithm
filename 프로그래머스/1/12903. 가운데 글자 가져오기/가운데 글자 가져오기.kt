class Solution {
    fun solution(s: String): String {
        val index = s.length / 2
        return if(s.length % 2 == 0){
            s.substring(index-1, index+1)
        } else{
            s.substring(index, index+1)
        }
    }
}