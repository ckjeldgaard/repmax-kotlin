package components

import model.business.FormulaBuilder
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

interface ResultProps : RProps {
    var weight: Int
    var reps: Int
    var formulaBuilder: FormulaBuilder
}

class Result(props: ResultProps) : RComponent<ResultProps, RState>(props) {

    override fun RBuilder.render() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}