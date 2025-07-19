package se.tp21.sixtypercent.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.ModifierKeyCode.LeftControl
import sh.kau.karabiner.karabinerRule

fun sixtyPercent() =
    ComplexModifications(
        title = "sixtyPercent",
        rules = listOf(
            karabinerRule {
                description = "Down (left_control + left_arrow)"
                mapping {
                    fromKey = KeyCode.LeftArrow
                    fromModifiers =
                        FromModifiers(mandatory = listOf(LeftControl), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.DownArrow
                }
            },
            karabinerRule {
                description = "Up (left_control + right_arrow)"
                mapping {
                    fromKey = KeyCode.RightArrow
                    fromModifiers =
                        FromModifiers(mandatory = listOf(LeftControl), optional = listOf(ModifierKeyCode.Any))
                    toKey = KeyCode.UpArrow
                }
            }
        )
    )