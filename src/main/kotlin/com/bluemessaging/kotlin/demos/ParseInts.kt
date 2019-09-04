package com.bluemessaging.kotlin.demos

import com.bluemessaging.kotlin.model.Either
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.multiple

/**
 * Parse a [list][listOfStrings] of integers
 */
class ParseInts : CliktCommand(help = "Parse a list of integers") {
    /**
     * Error codes for the main problems this program can run into.
     */
    private enum class Error {
        /**
         * When the program can't parse the provided string.
         */
        NotANumber,
        /**
         * When the program went through a lot of trouble to parse the provided
         * string and THAT GODDAMN NUMBER TURNED OUT TO BE A FRIKEN 3! >:(
         */
        IHate3
    }

    /**
     * A list of integers (string representations).
     */
    private val listOfStrings by argument(name = "integers",
            help = "a list of integers").multiple()

    /**
     * Attempts to parse integers from the provided strings.
     */
    override fun run() {
        /**
         * Attempts to read an integer from a string. If the operation is successful,
         * an [Int] is returned, otherwise an [Error] is returned.
         */
        fun parseInt(string: String): Either<Error, Int> {
            val num = string.toIntOrNull() ?: return Either.Left(Error.NotANumber)
            return if (num == 3) Either.Left(Error.IHate3) else Either.Right(num)
        }

        for (string in listOfStrings)
            when (val result = parseInt(string)) {
                is Either.Left -> when (result.value) {
                    Error.NotANumber -> println("'$string' is not a number")
                    Error.IHate3 -> println("I HATE NUMBER 3! >:(")
                }
                is Either.Right -> {
                    val (num) = result
                    println("Here's your number: $num")
                }
            }
    }
}