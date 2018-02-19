package model.business

import model.formula.Formula

class FormulaMatrix(private val weight: Int, private val reps: Int, private val formulas: Array<Formula>) {

    fun build(): Array<Array<Int>> {
        val matrix = Array(10, {Array(this.formulas.size,{0})})
        for (i in 0 until 10) {
            for (j in 0 until this.formulas.size) {
                val numbers = this.formulas[j].repmax(this.weight, this.reps)
                matrix[i][j] = numbers[i]
            }
        }
        return matrix
    }

}