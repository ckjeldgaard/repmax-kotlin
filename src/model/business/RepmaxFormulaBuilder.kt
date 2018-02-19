package model.business

import model.formula.Formula
import model.formula.LombardiFormula

class RepmaxFormulaBuilder : FormulaBuilder {

    override fun getFormulas(): Collection<Formula> {
        val formulas = arrayListOf<Formula>()
        formulas.add(LombardiFormula())
        return formulas
    }
}