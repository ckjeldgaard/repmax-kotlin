package model.formula

import util.Constants.Companion.DEFAULT_FORMULA_SIZE
import kotlin.math.floor

class EpleyFormula : Formula {

    override fun name(): String {
        return "Epley"
    }

    override fun repmax(weight: Int, reps: Int): IntArray {
        val oneRM = weight.toDouble() * (1.0 + reps.toDouble() / 30.0)
        val rms = arrayListOf(floor(oneRM).toInt())
        for (i in 2..DEFAULT_FORMULA_SIZE) {
            rms.add(floor(oneRM / (1.0 + i.toDouble() / 30.0)).toInt())
        }
        return rms.toIntArray()
    }
}