package se.tp21.sixtypercent.karabiner.modifications

import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.FromModifiers
import sh.kau.karabiner.KarabinerRule
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
import sh.kau.karabiner.KeyCode.VolumeDecrement
import sh.kau.karabiner.KeyCode.VolumeIncrement
import sh.kau.karabiner.ModifierKeyCode
import sh.kau.karabiner.ModifierKeyCode.LeftOption
import sh.kau.karabiner.ModifierKeyCode.LeftShift
import sh.kau.karabiner.karabinerRule

fun sixtyPercentFn() =
    ComplexModifications(
        title = "sixtyPercentFn",
        rules = rules()
    )

private fun rules(): List<KarabinerRule> =
    listOf(
        karabinerRule {
            description = "` (right_command + escape)"
            mapping {
                fromKey = Escape
                fromModifiers = FromModifiers(mandatory = listOf(ModifierKeyCode.RightCommand))
                toKey = GraveAccentAndTilde
            }
        },
        karabinerRule {
            description = "command+` (right_command + left_command + escape)"
            mapping {
                fromKey = Escape
                fromModifiers =
                    FromModifiers(mandatory = listOf(ModifierKeyCode.RightCommand, ModifierKeyCode.LeftCommand))
                toKey = GraveAccentAndTilde
                toModifiers = listOf(ModifierKeyCode.LeftCommand)
            }
        },
        karabinerRule {
            description = "~ (left_option + escape)"
            mapping {
                fromKey = Escape
                fromModifiers = FromModifiers(mandatory = listOf(LeftOption))
                toKey = GraveAccentAndTilde
                toModifiers = listOf(LeftShift)
            }
        },
        karabinerRule {
            description = "f1 (right_command + 1)"
            mapping {
                fromKey = Num1
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F1
            }
        },
        karabinerRule {
            description = "f2 (right_command + 2)"
            mapping {
                fromKey = Num2
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F2
            }
        },
        karabinerRule {
            description = "f3 (right_command + 3)"
            mapping {
                fromKey = Num3
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F3
            }
        },
        karabinerRule {
            description = "f4 (right_command + 4)"
            mapping {
                fromKey = Num4
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F4
            }
        },
        karabinerRule {
            description = "f5 (right_command + 5)"
            mapping {
                fromKey = Num5
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F5
            }
        },
        karabinerRule {
            description = "f6 (right_command + 6)"
            mapping {
                fromKey = Num6
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F6
            }
        },
        karabinerRule {
            description = "f7 (right_command + 7)"
            mapping {
                fromKey = Num7
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F7
            }
        },
        karabinerRule {
            description = "f8 (right_command + 8)"
            mapping {
                fromKey = Num8
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F8
            }
        },
        karabinerRule {
            description = "f9 (right_command + 9)"
            mapping {
                fromKey = Num9
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F9
            }
        },
        karabinerRule {
            description = "f10 (right_command + 0)"
            mapping {
                fromKey = Num0
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F10
            }
        },
        karabinerRule {
            description = "f11 (right_command + hyphen)"
            mapping {
                fromKey = Hyphen
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F11
            }
        },
        karabinerRule {
            description = "f12 (right_command + equal_sign)"
            mapping {
                fromKey = EqualSign
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = F12
            }
        },
        karabinerRule {
            description = "brightness decrement (f1)"
            mapping {
                fromKey = F1
                toKey = DisplayBrightnessDecrement
            }
        },
        karabinerRule {
            description = "brightness increment (f2)"
            mapping {
                fromKey = F2
                toKey = DisplayBrightnessIncrement
            }
        },
        karabinerRule {
            description = "mission control (f3)"
            mapping {
                fromKey = F3
                toKey = MissionControl
            }
        },
        karabinerRule {
            description = "mute (f10)"
            mapping {
                fromKey = F10
                toKey = Mute
            }
        },
        karabinerRule {
            description = "volume decrement (f11)"
            mapping {
                fromKey = F11
                toKey = VolumeDecrement
            }
        },
        karabinerRule {
            description = "volume increment (f12)"
            mapping {
                fromKey = F12
                toKey = VolumeIncrement
            }
        }
    )