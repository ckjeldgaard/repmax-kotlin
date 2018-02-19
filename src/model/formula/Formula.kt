package model.formula

interface Formula {
    fun name(): String
    fun repmax(weight: Int, reps: Int): IntArray
}