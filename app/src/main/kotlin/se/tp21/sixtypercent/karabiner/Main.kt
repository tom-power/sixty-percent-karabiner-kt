package se.tp21.sixtypercent.karabiner

import sh.kau.karabiner.json
import java.io.File

fun main() {
    sixtyPercentModificationsMap().forEach { (key, modifications) ->
        try {
            val outputFile = File("build/$key.json")
            val karabinerJson = json().encodeToString(modifications)
            outputFile.writeText(karabinerJson)
            println("Successfully wrote $key.json to ${outputFile.absolutePath}")
        } catch (e: Exception) {
            System.err.println("Error writing $key.json: ${e.message}")
            e.printStackTrace()
        }
    }

}
