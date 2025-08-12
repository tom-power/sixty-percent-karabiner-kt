package se.tp21.sixtypercent.karabiner.modifications

import sh.kau.karabiner.*
import sh.kau.karabiner.KeyCode.*

fun sixtyPercentMacKeys() =
    ComplexModifications(
        title = "sixtyPercentMacKeys",
        rules = rules()
    )

private fun rules(): List<KarabinerRule> = macKeysFnCommand() + macKeysFn()

private fun macKeysFnCommand(): List<KarabinerRule> = listOf(
    karabinerRule {
        description = "brightness decrement (left_control + right_command + 1)"
        mapping {
            fromKey = Num1
            fromModifiers = FromModifiers(
                mandatory =
                    listOf(ModifierKeyCode.LeftControl, ModifierKeyCode.RightCommand)
            )
            toKey = DisplayBrightnessDecrement
        }
    },
    karabinerRule {
        description = "brightness increment (left_control + right_command + 2)"
        mapping {
            fromKey = Num2
            fromModifiers = FromModifiers(
                mandatory =
                    listOf(ModifierKeyCode.LeftControl, ModifierKeyCode.RightCommand)
            )
            toKey = DisplayBrightnessIncrement
        }
    },
    karabinerRule {
        description = "mission control (left_control + right_command + 3)"
        mapping {
            fromKey = Num3
            fromModifiers = FromModifiers(
                mandatory =
                    listOf(ModifierKeyCode.LeftControl, ModifierKeyCode.RightCommand)
            )
            toKey = MissionControl
        }
    },
    karabinerRule {
        description = "mute (left_control + right_command + 0)"
        mapping {
            fromKey = Num0
            fromModifiers = FromModifiers(
                mandatory =
                    listOf(ModifierKeyCode.LeftControl, ModifierKeyCode.RightCommand)
            )
            toKey = Mute
        }
    },
    karabinerRule {
        description = "volume decrement (left_control + right_command + hyphen)"
        mapping {
            fromKey = Hyphen
            fromModifiers = FromModifiers(
                mandatory =
                    listOf(ModifierKeyCode.LeftControl, ModifierKeyCode.RightCommand)
            )
            toKey = VolumeDecrement
        }
    },
    karabinerRule {
        description = "volume increment (left_control + equals)"
        mapping {
            fromKey = EqualSign
            fromModifiers = FromModifiers(
                mandatory =
                    listOf(ModifierKeyCode.LeftControl, ModifierKeyCode.RightCommand)
            )
            toKey = VolumeIncrement
        }
    }
)

private fun macKeysFn(): List<KarabinerRule> = listOf(
    karabinerRule {
        description = "brightness decrement (left_control + f1)"
        mapping {
            fromKey = F1
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
            fromKey = F2
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
            fromKey = F3
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
            fromKey = F10
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
            fromKey = F11
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
            fromKey = F12
            fromModifiers = FromModifiers(
                mandatory =
                    listOf(ModifierKeyCode.LeftControl)
            )
            toKey = VolumeIncrement
        }
    }
)