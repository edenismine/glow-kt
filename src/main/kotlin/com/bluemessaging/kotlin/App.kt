package com.bluemessaging.kotlin

import com.bluemessaging.kotlin.demos.HappyBirthday
import com.bluemessaging.kotlin.demos.ParseInts
import com.github.ajalt.clikt.core.NoRunCliktCommand
import com.github.ajalt.clikt.core.subcommands

/**
 * Blue Kotlin App
 */
class App {
    /**
     * This command provides a way to run a few Kotlin examples that can
     * help developers that are new to Kotlin wrap their heads around most
     * of the key Kotlin idioms, practices,etc.
     *
     * @author Daniel Aragon (laragon@bluemessaging.com)
     */
    companion object Demo :  NoRunCliktCommand(
            name = "blue-kotlin",
            help = "Bluemessaging Kotlin Bootcamp utility",
            epilog = """
            This command provides a way to run a few Kotlin examples that can
            help developers that are new to Kotlin wrap their heads around most
            of the key Kotlin idioms, practices,etc.
            
            It was developed by Daniel Aragon (laragon@bluemessaging.com) as a
            tool to teach the kotlin lang to fellow developers.
        """.trimIndent()
    ) {
        init {
            subcommands(
                    ParseInts(),
                    HappyBirthday()
            )
        }
    }
}

/**
 * The entry-point of our application.
 */
fun main(args:Array<String>) = App.main(args)
