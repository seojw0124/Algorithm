class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        
        val arr = arrayOf("aya", "ye", "woo", "ma")

        for (str in babbling) {
            var newStr = str
            for (babyStr in arr) {
                if (newStr.contains(babyStr)) {
                    var index = -2
                    while (index != -1) {
                        index = newStr.indexOf(babyStr)
                        if (index == -1) break
                        newStr = newStr.replaceRange(index, index + babyStr.length, " ")
                        println("str: $str babyStr: $babyStr index: $index newStr: $newStr")
                        val newIndex = newStr.indexOf(babyStr)
                        if (index + 1 == newIndex) break
                    }
                    if (newStr.isBlank()) answer++
                }
            }
        }
        return answer
    }
}
