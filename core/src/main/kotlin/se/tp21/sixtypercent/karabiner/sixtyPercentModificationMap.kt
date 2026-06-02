package se.tp21.sixtypercent.karabiner

import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentFunctionKeys
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentMacKeys
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentNavigation
import se.tp21.sixtypercent.karabiner.modifications.sixtyPercentSymbols
import sh.kau.karabiner.ComplexModifications

val sixtyPercentModificationsMap: Map<String, ComplexModifications> =
    mapOf(
        "sixtyPercentFunctionKeys" to sixtyPercentFunctionKeys(),
        "sixtyPercentMacKeys" to sixtyPercentMacKeys(),
        "sixtyPercentNavigation" to sixtyPercentNavigation(),
        "sixtyPercentSymbols" to sixtyPercentSymbols(),
    )
