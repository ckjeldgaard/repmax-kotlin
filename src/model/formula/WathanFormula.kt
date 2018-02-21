package model.formula

import util.Constants.Companion.DEFAULT_FORMULA_SIZE
import kotlin.math.exp
import kotlin.math.floor

class WathanFormula : Formula {
    override fun name(): String {
        return "Wathan"
    }

    override fun repmax(weight: Int, reps: Int): IntArray {
        val oneRM = (weight.toDouble() * 100) / (48.8 + (53.8 * exp(-1 * (reps.toDouble() * 0.075))))
        val rms = arrayListOf(floor(oneRM).toInt())
        for (i in 2..DEFAULT_FORMULA_SIZE) {
            rms.add(floor(
                    (oneRM * (48.8 + (53.8 * exp(-1 * (i.toDouble() * 0.075))))) / 100
            ).toInt())
        }
        return rms.toIntArray()
    }
}