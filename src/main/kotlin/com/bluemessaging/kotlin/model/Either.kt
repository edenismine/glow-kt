package com.bluemessaging.kotlin.model

/**
 * Represents a value of one of two possible types (a disjoint union.) Instances
 * of [Either] are either an instance of [Left] or [Right] (extract taken from
 * [Scala's documentation](https://www.scala-lang.org/api/2.9.3/scala/Either.html)).
 *
 * Error handling is a popular use case for this type, and by convention, when
 * using it that way, the [Left] represents the error case, whereas the [Right]
 * contains the success value (see
 * [this](http://bit.ly/bm-kotlin-bootcamp-either-1) article).
 */
sealed class Either<out L, out R>(
    /**
     * If the underlying value is contained in the left branch.
     */
    val isLeft: Boolean = false,
    /**
     * If the underlying value is contained in the right branch.
     */
    val isRight: Boolean = false
) {
    /**
     * Left branch of the [Either] type.
     */
    data class Left<out L>(
        /** The encapsulated value. */
        val value: L
    ) : Either<L, Nothing>(isLeft = true)
    /**
     * Right branch of the [Either] type.
     */
    data class Right<out R>(
        /** The encapsulated value of type. */
        val value: R
    ) : Either<Nothing, R>(isRight = true)
}

