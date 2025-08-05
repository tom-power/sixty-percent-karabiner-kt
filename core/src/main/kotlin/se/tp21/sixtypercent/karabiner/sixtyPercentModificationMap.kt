package se.tp21.sixtypercent.karabiner

import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentFn
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentNavigation
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentSymbols
import sh.kau.karabiner.ComplexModifications

val sixtyPercentModificationsMap: Map<String, ComplexModifications> =
    mapOf(
        "sixtyPercentFn" to sixtyPercentFn(),
        "sixtyPercentNavigation" to sixtyPercentNavigation(),
        "sixtyPercentSymbols" to sixtyPercentSymbols(),
    )
