package components.range

import util.*
import kotlinx.html.*
import kotlinx.html.js.onChangeFunction
import org.w3c.dom.events.Event
import react.*
import react.dom.*

interface RangeProps : RProps {
    var id: String
    var label: String
    var abbr: String
    var min: Int
    var max: Int
    var step: Int
    var default: Int
    var inputHandler: (value: Int) -> Unit
}

interface RangeState : RState {
    var value: Int
}

class Range(props: RangeProps) : RComponent<RangeProps, RangeState>(props) {

    override fun RangeState.init(props: RangeProps) {
        value = props.default
    }

    private fun handleChange(event: Event) {
        val inputValue = event.inputValue
        if (inputValue != "") {
            setState { value = inputValue.toInt() }
            props.inputHandler(inputValue.toInt())
        }
    }

    override fun RBuilder.render() {
        div("range") {
            div("meta") {
                label {
                    attrs.htmlFor = props.id
                    +props.label
                }
                p {
                    +"${state.value}${props.abbr}"
                }
            }
            input(type = InputType.range, name = props.id) {
                attrs.id = props.id
                attrs.min = props.min.toString()
                attrs.max = props.max.toString()
                attrs.step = props.step.toString()
                attrs.onChangeFunction = {
                    val eventValue = it.inputValue.toInt()
                    setState { value = eventValue }
                    props.inputHandler(eventValue)

                }
            }
        }
    }

}

fun RBuilder.range(id: String = "range", label: String, abbr: String, min: Int, max: Int, step: Int, default: Int, inputHandler: (value: Int) -> Unit) = child(Range::class) {
    attrs.id = id
    attrs.label = label
    attrs.abbr = abbr
    attrs.min = min
    attrs.max = max
    attrs.step = step
    attrs.default = default
    attrs.inputHandler = inputHandler
}