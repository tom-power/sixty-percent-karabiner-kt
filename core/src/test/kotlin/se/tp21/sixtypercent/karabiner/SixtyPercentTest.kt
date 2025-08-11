package se.tp21.sixtypercent.karabiner

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import se.tp21.resourcesapproval.ResourcesApproval
import se.tp21.resourcesapproval.WriteTo
import sh.kau.karabiner.ComplexModifications
import sh.kau.karabiner.json

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SixtyPercentTest {
    @ParameterizedTest
    @MethodSource("sixtyPercents")
    fun `sixty percent rules are correct`(key: String, modifications: ComplexModifications) {
        ResourcesApproval.assertApproved(
            approved = "/${key}.json",
            actual = json().encodeToString(modifications),
            writeTo = WriteTo.Approved
        )
    }

    @Suppress("unused")
    private fun sixtyPercents() =
        sixtyPercentModificationsMap.map { (key, modifications) ->
            Arguments.of(key, modifications)
        }

}

