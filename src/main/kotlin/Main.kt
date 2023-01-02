fun main() {
    solution(mutableListOf(2, 3, 2, 3, 4, 5), 2, 4).forEach {
        println(it)
    }
}

fun solution(inputArray: MutableList<Int>, l: Int, r: Int): MutableList<Int> {
    val tempList = mutableListOf<Int>()
    for (i in 0 until inputArray.size) {
        if (i < l || i > r) {
            tempList.add(inputArray[i])
        }
    }
    return tempList
}
