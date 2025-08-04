package se.tp21.sixtypercent.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.From
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.KeyCode.Backslash
import sh.kau.karabiner.KeyCode.Escape
import sh.kau.karabiner.KeyCode.Slash
import sh.kau.karabiner.Manipulator
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.ModifierKeyCode.LeftControl
import sh.kau.karabiner.ModifierKeyCode.LeftOption
import sh.kau.karabiner.ModifierKeyCode.LeftShift
import sh.kau.karabiner.ModifierKeyCode.RightShift
import sh.kau.karabiner.To
import sh.kau.karabiner.karabinerRule

fun sixtyPercentYoda() = ComplexModifications(
    title = "sixtyPercentYoda",
    rules = listOf(
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
)