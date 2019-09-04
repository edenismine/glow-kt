package com.bluemessaging.kotlin.demos

import com.bluemessaging.kotlin.model.User
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.triple
import java.time.LocalDate

/**
 * A program that wishes all the people whose birthdays have already been celebrated this year a happy birthday.
 */
class HappyBirthday : CliktCommand(help = "Wishes you and/or your coworkers happy birthday!") {
    /** Resource URL with the some sample birthday data. */
    private val coworkersUrl = javaClass.getResource("/coworkers.csv")
    /** A [Triple] that holds the user's name and their birthday's day and month (in that order). */
    private val me by option(
            help = """
                Use this option to provide your name, the day and the month of your birthday.
                E.g: if your name is Daniel and your birthday is on the 9th of December, input "Daniel 9 12"
            """.trimIndent()
    ).triple()
    /** All past dates. */
    private val thePast = LocalDate.MIN..LocalDate.now()
    /** Current year. */
    private val thisYear = LocalDate.now().year

    /**
     * Reads the user's coworkers' data, filters the appropriate [User]s, and wishes them happy birthday.
     * If the user provided their birthday through the [me] option, the program either wishes the user a happy
     * birthday or informs them that their birthday is still in the future.
     */
    override fun run() {
        coworkersUrl.openStream().bufferedReader().useLines { lines ->
            lines.map { line ->
                line.split(',')
            }.map { (name, day, month) ->
                User(name, LocalDate.of(thisYear, month.toInt(), day.toInt()))
            }.filter { (_, date) ->
                date in thePast
            }.forEach { user ->
                println("Looks like ${user.name}'s birthday was on a ${user.birthday.dayOfWeek} this year, HAPPY BIRTHDAY!")
            }
        }
        val (name, day, month) = me ?: return
        val myBD = LocalDate.of(thisYear, month.toInt(), day.toInt())
        val message =
                if (myBD in thePast)
                    "Looks like your birthday was on a ${myBD.dayOfWeek} this year, HAPPY BIRTHDAY ${name.toUpperCase()}!"
                else
                    "You haven't had your birthday this year yet, $name :("
        println(message)
    }
}