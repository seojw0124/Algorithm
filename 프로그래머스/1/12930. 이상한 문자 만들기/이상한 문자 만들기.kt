class Solution {
    fun solution(s: String): String {
        var answer = ""
        
        var list = s.split(" ").toMutableList()
        
        for (i in 0 until list.size) {
            var str = ""
            for (j in 0 until list[i].length) {
                if (j % 2 == 0) {
                    str += list[i][j].toUpperCase()
                } else {
                    str += list[i][j].toLowerCase()
                }
            }
            list[i] = str
        }
        
        return list.joinToString(" ")
    }
}