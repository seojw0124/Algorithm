class Solution {
    fun solution(phone_number: String): String {
        val length = phone_number.length
        var prevString: String = ""
        for(i in 0 until length-4) {
            prevString += "*"
        }
        val nextString = phone_number.substring(length-4, length)
        
        return prevString + nextString
    }
}