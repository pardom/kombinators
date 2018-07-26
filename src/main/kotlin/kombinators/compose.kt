package kombinators

import kombinators.birds.bluebird
import kombinators.birds.queer

/**
 * Function composition.
 *
 * Example:
 *
 * ```kotlin
 * val times2 = { x: Int -> x * 2 }
 * val minus1 = { x: Int -> x - 1 }
 * val minus1times2 = compose<Int, Int, Int>()(times2)(minus1)
 *
 * minus1times2(3) // 4
 * ```
 */
fun <A, B, C> compose() = bluebird<A, B, C>()

/**
 * Function composition.
 *
 * Example:
 *
 * ```kotlin
 * val times2 = { x: Int -> x * 2 }
 * val minus1 = { x: Int -> x - 1 }
 * val minus1times2 = times2 compose minus1
 *
 * minus1times2(3) // 4
 * ```
 */
infix fun <A, B, C> ((B) -> C).compose(g: ((A) -> B)) = bluebird<A, B, C>()(this)(g)

/**
 * Reversed function composition.
 *
 * Example:
 *
 * ```kotlin
 * val times2 = { x: Int -> x * 2 }
 * val minus1 = { x: Int -> x - 1 }
 * val minus1times2 = compose<Int, Int, Int>()(minus1)(times2)
 *
 * minus1times2(3) // 4
 * ```
 */
fun <A, B, C> reverseCompose() = queer<A, B, C>()

/**
 * Reversed function composition.
 *
 * Example:
 *
 * ```kotlin
 * val times2 = { x: Int -> x * 2 }
 * val minus1 = { x: Int -> x - 1 }
 * val minus1times2 = minus1 compose times2
 *
 * minus1times2(3) // 4
 * ```
 */
infix fun <A, B, C> ((A) -> B).reverseCompose(g: ((B) -> C)) = queer<A, B, C>()(this)(g)
