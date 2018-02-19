package model.business

import model.formula.Formula
import model.formula.LombardiFormula

class RepmaxFormulaBuilder : FormulaBuilder {

    override fun getFormulas(): Array<Formula> {
        return arrayOf(LombardiFormula())
    }
}