package se.tp21.sixtypercent.karabiner.modifications

import sh.kau.karabiner.*
import sh.kau.karabiner.KeyCode.*

fun sixtyPercentMacKeys() =
    ComplexModifications(
        title = "sixtyPercentMacKeys",
        rules = rules()
    )

private fun rules(): List<KarabinerRule> =
    listOf(
        karabinerRule {
            description = "brightness decrement (left_control + f1)"
            mapping {
                fromKey = KeyCode.F1
                fromModifiers = FromModifiers(
                    mandatory =
                        listOf(ModifierKeyCode.LeftControl)
                )
                toKey = DisplayBrightnessDecrement
            }
        },
        karabinerRule {
            description = "brightness increment (left_control + f2)"
            mapping {
                fromKey = KeyCode.F2
                fromModifiers = FromModifiers(
                    mandatory =
                        listOf(ModifierKeyCode.LeftControl)
                )
                toKey = DisplayBrightnessIncrement
            }
        },
        karabinerRule {
            description = "mission control (left_control + f3)"
            mapping {
                fromKey = KeyCode.F3
                fromModifiers = FromModifiers(
                    mandatory =
                        listOf(ModifierKeyCode.LeftControl)
                )
                toKey = MissionControl
            }
        },
        karabinerRule {
            description = "mute (left_control + f10)"
            mapping {
                fromKey = KeyCode.F10
                fromModifiers = FromModifiers(
                    mandatory =
                        listOf(ModifierKeyCode.LeftControl)
                )
                toKey = Mute
            }
        },
        karabinerRule {
            description = "volume decrement (left_control + f11)"
            mapping {
                fromKey = KeyCode.F11
                fromModifiers = FromModifiers(
                    mandatory =
                        listOf(ModifierKeyCode.LeftControl)
                )
                toKey = VolumeDecrement
            }
        },
        karabinerRule {
            description = "volume increment (left_control + f12)"
            mapping {
                fromKey = KeyCode.F12
                fromModifiers = FromModifiers(
                    mandatory =
                        listOf(ModifierKeyCode.LeftControl)
                )
                toKey = VolumeIncrement
            }
        }
    )