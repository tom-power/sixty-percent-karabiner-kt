package se.tp21.sixtypercent.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KarabinerRule
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.KeyCode.EqualSign
import sh.kau.karabiner.KeyCode.F1
import sh.kau.karabiner.KeyCode.F10
import sh.kau.karabiner.KeyCode.F11
import sh.kau.karabiner.KeyCode.F12
import sh.kau.karabiner.KeyCode.F2
import sh.kau.karabiner.KeyCode.F3
import sh.kau.karabiner.KeyCode.F4
import sh.kau.karabiner.KeyCode.F5
import sh.kau.karabiner.KeyCode.F6
import sh.kau.karabiner.KeyCode.F7
import sh.kau.karabiner.KeyCode.F8
import sh.kau.karabiner.KeyCode.F9
import sh.kau.karabiner.KeyCode.Hyphen
import sh.kau.karabiner.KeyCode.Num0
import sh.kau.karabiner.KeyCode.Num1
import sh.kau.karabiner.KeyCode.Num2
import sh.kau.karabiner.KeyCode.Num3
import sh.kau.karabiner.KeyCode.Num4
import sh.kau.karabiner.KeyCode.Num5
import sh.kau.karabiner.KeyCode.Num6
import sh.kau.karabiner.KeyCode.Num7
import sh.kau.karabiner.KeyCode.Num8
import sh.kau.karabiner.KeyCode.Num9
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.ModifierKeyCode.Any
import sh.kau.karabiner.ModifierKeyCode.LeftControl
import sh.kau.karabiner.ModifierKeyCode.RightCommand
import sh.kau.karabiner.ModifierKeyCode.RightControl
import sh.kau.karabiner.karabinerRule

fun sixtyPercentFunctionKeys() =
    ComplexModifications(
        title = "sixtyPercentFunctionKeys",
        rules = rules()
    )

private fun rules(): List<KarabinerRule> =
    numToFnKeyMappings().map { it.toControlToFnRule() }

typealias KeyMapping = Pair<KeyCode, KeyCode>

private fun numToFnKeyMappings(): List<KeyMapping> =
    listOf(
        Num1 to F1,
        Num2 to F2,
        Num3 to F3,
        Num4 to F4,
        Num5 to F5,
        Num6 to F6,
        Num7 to F7,
        Num8 to F8,
        Num9 to F9,
        Num0 to F10,
        Hyphen to F11,
        EqualSign to F12,
    )

private fun KeyMapping.toControlToFnRule(): KarabinerRule {
    val (from, to) = this
    return karabinerRule {
        val toName = to.name.lowercase()
        val fromName = from.name.lowercase()
        description = "$toName (right_command+$fromName)"
        mapping {
            fromKey = from
            fromModifiers = FromModifiers(
                mandatory = listOf(LeftControl),
                optional = listOf(Any)
            )
            toKey = to
        }
    }
}