fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var row: String = ""
    
    repeat(a) {
        row += "*"
    }
    
    repeat(b) {
        println(row)
    }
}