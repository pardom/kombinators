package kombinators

import kombinators.birds.idiotStar
import kombinators.birds.thrush

/**
 * Extracts the value of a function.
 *
 * The infix version of this function is preferred as is supports type inference.
 *
 * Example:
 *
 * ```kotlin
 * val plus1 = { x: Int -> x + 1 }
 * apply(plus1)(3) // 4
 * ```
 */
fun <A, B> apply() = idiotStar<A, B>()

/**
 * Extracts the value of a function.
 *
 * Example:
 *
 * ```kotlin
 * val plus1 = { x: Int -> x + 1 }
 * plus1 apply 3 // 4
 * ```
 */
infix fun <A, B> ((A) -> B).apply(a: A) = idiotStar<A, B>()(this)(a)

/**
 * Extracts the value of a function from left to right.
 *
 * The infix version of this function is preferred as is supports type inference.
 *
 * Example:
 *
 * ```kotlin
 * val plus1 = { x: Int -> x + 1 }
 * reverseApply(3)(plus1) // 4
 * ```
 */
fun <A, B> reverseApply() = thrush<A, B>()

/**
 * Extracts the value of a function from left to right.
 *
 * Example:
 *
 * ```kotlin
 * val plus1 = { x: Int -> x + 1 }
 * 3 reverseApply plus1 // 4
 * ```
 */
infix fun <A, B> A.reverseApply(f: ((A) -> B)) = thrush<A, B>()(this)(f)
