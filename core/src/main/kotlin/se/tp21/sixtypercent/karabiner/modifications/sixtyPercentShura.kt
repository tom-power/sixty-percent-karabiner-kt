package se.tp21.sixtypercent.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.From
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.Manipulator
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.ModifierKeyCode.LeftControl
import sh.kau.karabiner.ModifierKeyCode.LeftShift
import sh.kau.karabiner.ModifierKeyCode.RightShift
import sh.kau.karabiner.To
import sh.kau.karabiner.karabinerRule

fun sixtyPercentShura() = ComplexModifications(
    title = "sixtyPercentShura",
    rules = listOf(
        karabinerRule(
            description = "~/ (right_shift+` to ~/)",
            manipulators = listOf(
                Manipulator(
                    from = From.with(
                        KeyCode.GraveAccentAndTilde,
                        FromModifiers(mandatory = listOf(ModifierKeyCode.RightShift))
                    ),
                    to = listOf(
                        To(KeyCode.NonUsPound, modifiers = listOf(ModifierKeyCode.LeftShift)),
                        To(KeyCode.Slash)
                    )
                )
            ).toTypedArray(),
        )
    )
)