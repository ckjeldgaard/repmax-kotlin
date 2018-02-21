package model.formula

import util.Constants.Companion.DEFAULT_FORMULA_SIZE
import kotlin.math.exp
import kotlin.math.floor

class MayhewFormula : Formula  {
    override fun name(): String {
        return "Mayhew"
    }

    override fun repmax(weight: Int, reps: Int): IntArray {
        val oneRM = (weight.toDouble() * 100.0) / (52.2 + 41.9 * exp(-1 * (reps.toDouble() * 0.055)))
        val rms = arrayListOf(floor(oneRM).toInt())
        for (i in 2..DEFAULT_FORMULA_SIZE) {
            rms.add(floor(
                    (oneRM * (52.2 + (41.9 * exp(-1 * (i.toDouble() * 0.055))))) / 100
            ).toInt())
        }
        return rms.toIntArray()
    }
}