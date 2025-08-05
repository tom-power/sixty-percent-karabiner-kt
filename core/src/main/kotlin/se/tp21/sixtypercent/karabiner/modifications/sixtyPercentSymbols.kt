package se.tp21.sixtypercent.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.From
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KarabinerRule
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.KeyCode.Backslash
import sh.kau.karabiner.KeyCode.DisplayBrightnessDecrement
import sh.kau.karabiner.KeyCode.DisplayBrightnessIncrement
import sh.kau.karabiner.KeyCode.EqualSign
import sh.kau.karabiner.KeyCode.Escape
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
import sh.kau.karabiner.KeyCode.GraveAccentAndTilde
import sh.kau.karabiner.KeyCode.Hyphen
import sh.kau.karabiner.KeyCode.MissionControl
import sh.kau.karabiner.KeyCode.Mute
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
import sh.kau.karabiner.KeyCode.Slash
import sh.kau.karabiner.KeyCode.VolumeDecrement
import sh.kau.karabiner.KeyCode.VolumeIncrement
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.ModifierKeyCode.LeftControl
import sh.kau.karabiner.ModifierKeyCode.LeftOption
import sh.kau.karabiner.ModifierKeyCode.LeftShift
import sh.kau.karabiner.ModifierKeyCode.RightShift
import sh.kau.karabiner.To
import sh.kau.karabiner.karabinerRule

fun sixtyPercentSymbols() =
    ComplexModifications(
        title = "sixtyPercentSymbols",
        rules = rules()
    )

private fun rules(): List<KarabinerRule> = listOf(
    karabinerRule {
        description = "~/ (right_shift + escape)"
        mapping {
            from = From(Escape, FromModifiers(mandatory = listOf(RightShift)))
            to = listOf(
                To(Backslash, listOf(LeftShift)),
                To(Slash)
            )
        }
    },
    karabinerRule {
        description = "~ (left_option + escape)"
        mapping {
            from = From(Escape, FromModifiers(mandatory = listOf(LeftOption)))
            to = listOf(
                To(Backslash, listOf(LeftShift)),
            )
        }
    }
)