package se.tp21.sixtypercent.karabiner.modifications

import sh.kau.karabiner.*
import sh.kau.karabiner.ModifierKeyCode.LeftControl
import sh.kau.karabiner.ModifierKeyCode.LeftShift

fun sixtyPercentNavigation() =
    ComplexModifications(
        title = "sixtyPercentNavigation",
        rules =rules()
    )

private fun rules(): List<KarabinerRule> = listOf(
    karabinerRule {
        description = "Down (left_control + left_arrow)"
        mapping {
            fromKey = KeyCode.LeftArrow
            fromModifiers =
                FromModifiers(mandatory = listOf(LeftControl), optional = listOf(LeftShift))
            toKey = KeyCode.DownArrow
        }
    },
    karabinerRule {
        description = "Up (left_control + right_arrow)"
        mapping {
            fromKey = KeyCode.RightArrow
            fromModifiers =
                FromModifiers(mandatory = listOf(LeftControl), optional = listOf(LeftShift))
            toKey = KeyCode.UpArrow
        }
    }
)
