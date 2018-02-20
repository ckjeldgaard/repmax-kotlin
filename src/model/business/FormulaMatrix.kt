package model.business

import model.formula.Formula

class FormulaMatrix(private val weight: Int, private val reps: Int, private val formulas: Array<Formula>) {

    fun build(): Array<Array<Int>> {
        val formulas = arrayListOf<IntArray>()
        for (i in 0 until this.formulas.size) {
            formulas.add(i, this.formulas[i].repmax(this.weight, this.reps))
        }
        val matrix = Array(10, {Array(this.formulas.size,{0})})
        for (j in 0 until 10) {
            for (k in 0 until this.formulas.size) {
                matrix[j][k] = formulas[k][j]
            }
        }
        return matrix
    }

}