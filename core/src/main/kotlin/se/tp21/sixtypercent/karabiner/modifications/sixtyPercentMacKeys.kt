package se.tp21.sixtypercent.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KarabinerRule
import sh.kau.karabiner.KeyCode
import sh.kau.karabiner.KeyCode.DisplayBrightnessDecrement
import sh.kau.karabiner.KeyCode.DisplayBrightnessIncrement
import sh.kau.karabiner.KeyCode.EqualSign
import sh.kau.karabiner.KeyCode.F1
import sh.kau.karabiner.KeyCode.F10
import sh.kau.karabiner.KeyCode.F11
import sh.kau.karabiner.KeyCode.F12
import sh.kau.karabiner.KeyCode.F2
import sh.kau.karabiner.KeyCode.F3
import sh.kau.karabiner.KeyCode.MissionControl
import sh.kau.karabiner.KeyCode.Mute
import sh.kau.karabiner.KeyCode.VolumeDecrement
import sh.kau.karabiner.KeyCode.VolumeIncrement
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.karabinerRule

fun sixtyPercentMacKeys() =
    ComplexModifications(
        title = "sixtyPercentMacKeys",
        rules = rules()
    )

private fun rules(): List<KarabinerRule> =
    listOf(
        karabinerRule {
            description = "brightness decrement (right_command + left_control + 1)"
            mapping {
                fromKey = KeyCode.Num1
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.LeftControl)
                )
                toKey = DisplayBrightnessDecrement
            }
        },
        karabinerRule {
            description = "brightness increment (right_command + left_control + 2)"
            mapping {
                fromKey = KeyCode.Num2
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.LeftControl)
                )
                toKey = DisplayBrightnessIncrement
            }
        },
        karabinerRule {
            description = "mission control (right_command + left_control + 3)"
            mapping {
                fromKey = KeyCode.Num3
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.LeftControl)
                )
                toKey = MissionControl
            }
        },
        karabinerRule {
            description = "mute (right_command + left_control + 0)"
            mapping {
                fromKey = KeyCode.Num0
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.LeftControl)
                )
                toKey = Mute
            }
        },
        karabinerRule {
            description = "volume decrement (right_command + left_control + minus)"
            mapping {
                fromKey = KeyCode.Hyphen
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.LeftControl)
                )
                toKey = VolumeDecrement
            }
        },
        karabinerRule {
            description = "volume increment (right_command + left_control + equal)"
            mapping {
                fromKey = EqualSign
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.LeftControl)
                )
                toKey = VolumeIncrement
            }
        }
    )