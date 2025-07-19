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

fun sixtyPercentK12() = ComplexModifications(
    title = "sixtyPercentK12",
    rules = listOf(
        karabinerRule(
            description = "~/ (right_shift + escape)",
            manipulators = listOf(
                Manipulator(
                    from = From.with(
                        KeyCode.Escape,
                        FromModifiers(mandatory = listOf(ModifierKeyCode.RightShift))
                    ),
                    to = listOf(
                        To(KeyCode.GraveAccentAndTilde, modifiers = listOf(ModifierKeyCode.LeftShift)),
                        To(KeyCode.Slash)
                    )
                )
            ).toTypedArray(),
        ),
        karabinerRule {
            description = "` (right_command + escape)"
            mapping {
                fromKey = KeyCode.Escape
                fromModifiers = FromModifiers(mandatory = listOf(ModifierKeyCode.RightCommand))
                toKey = KeyCode.GraveAccentAndTilde
            }
        },
        karabinerRule {
            description = "command+` (right_command + left_command + escape)"
            mapping {
                fromKey = KeyCode.Escape
                fromModifiers =
                    FromModifiers(mandatory = listOf(ModifierKeyCode.RightCommand, ModifierKeyCode.LeftCommand))
                toKey = KeyCode.GraveAccentAndTilde
                toModifiers = listOf(ModifierKeyCode.LeftCommand)
            }
        },
        karabinerRule {
            description = "~ (left_option + escape)"
            mapping {
                fromKey = KeyCode.Escape
                fromModifiers = FromModifiers(mandatory = listOf(ModifierKeyCode.LeftOption))
                toKey = KeyCode.GraveAccentAndTilde
                toModifiers = listOf(ModifierKeyCode.LeftShift)
            }
        },
        karabinerRule {
            description = "f1 (right_command + 1)"
            mapping {
                fromKey = KeyCode.Num1
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F1
            }
        },
        karabinerRule {
            description = "f2 (right_command + 2)"
            mapping {
                fromKey = KeyCode.Num2
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F2
            }
        },
        karabinerRule {
            description = "f3 (right_command + 3)"
            mapping {
                fromKey = KeyCode.Num3
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F3
            }
        },
        karabinerRule {
            description = "f4 (right_command + 4)"
            mapping {
                fromKey = KeyCode.Num4
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F4
            }
        },
        karabinerRule {
            description = "f5 (right_command + 5)"
            mapping {
                fromKey = KeyCode.Num5
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F5
            }
        },
        karabinerRule {
            description = "f6 (right_command + 6)"
            mapping {
                fromKey = KeyCode.Num6
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F6
            }
        },
        karabinerRule {
            description = "f7 (right_command + 7)"
            mapping {
                fromKey = KeyCode.Num7
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F7
            }
        },
        karabinerRule {
            description = "f8 (right_command + 8)"
            mapping {
                fromKey = KeyCode.Num8
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F8
            }
        },
        karabinerRule {
            description = "f9 (right_command + 9)"
            mapping {
                fromKey = KeyCode.Num9
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F9
            }
        },
        karabinerRule {
            description = "f10 (right_command + 0)"
            mapping {
                fromKey = KeyCode.Num0
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F10
            }
        },
        karabinerRule {
            description = "f11 (right_command + hyphen)"
            mapping {
                fromKey = KeyCode.Hyphen
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F11
            }
        },
        karabinerRule {
            description = "f12 (right_command + equal_sign)"
            mapping {
                fromKey = KeyCode.EqualSign
                fromModifiers = FromModifiers(
                    mandatory = listOf(ModifierKeyCode.RightCommand),
                    optional = listOf(ModifierKeyCode.Any)
                )
                toKey = KeyCode.F12
            }
        },
        karabinerRule {
            description = "brightness decrement (f1)"
            mapping {
                fromKey = KeyCode.F1
                toKey = KeyCode.DisplayBrightnessDecrement
            }
        },
        karabinerRule {
            description = "brightness increment (f2)"
            mapping {
                fromKey = KeyCode.F2
                toKey = KeyCode.DisplayBrightnessIncrement
            }
        },
        karabinerRule {
            description = "mission control (f3)"
            mapping {
                fromKey = KeyCode.F3
                toKey = KeyCode.MissionControl
            }
        },
        karabinerRule {
            description = "mute (f10)"
            mapping {
                fromKey = KeyCode.F10
                toKey = KeyCode.Mute
            }
        },
        karabinerRule {
            description = "volume decrement (f11)"
            mapping {
                fromKey = KeyCode.F11
                toKey = KeyCode.VolumeDecrement
            }
        },
        karabinerRule {
            description = "volume increment (f12)"
            mapping {
                fromKey = KeyCode.F12
                toKey = KeyCode.VolumeIncrement
            }
        }
    )
)