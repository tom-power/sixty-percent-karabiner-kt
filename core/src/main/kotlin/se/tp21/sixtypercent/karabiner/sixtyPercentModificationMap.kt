package se.tp21.sixtypercent.karabiner

import se.tp21.sixtypercent.karabiner.modifications.sixtyPercent
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentK12
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentYoda
import sh.kau.karabiner.ComplexModifications

val sixtyPercentModificationsMap: Map<String, ComplexModifications> =
    mapOf(
        "sixtyPercent" to sixtyPercent(),
        "sixtyPercent_K12" to sixtyPercentK12(),
        "sixtyPercent_Yoda" to sixtyPercentYoda(),
    )
