package model.business

class Avg(private val numbers: IntArray) {
    fun average(): Int {
        return this.numbers.average().toInt()
    }
}