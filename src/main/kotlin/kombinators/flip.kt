package kombinators

import kombinators.birds.cardinal

/**
 * flip f takes its (first) two arguments in the reverse order of f.
 *
 * The overloaded version of this function is preferred as is supports type inference.
 *
 * Example:
 *
 * ```kotlin
 * val concat = { x -> { y -> x + y } }
 * flip<String, String, String>()(concat)("word")("hello") // helloworld
 * ```
 */
fun <A, B, C> flip() = cardinal<A, B, C>()

/**
 * flip f takes its (first) two arguments in the reverse order of f.
 *
 * Example:
 *
 * ```kotlin
 * val concat = { x -> { y -> x + y } }
 * flip(concat)("word")("hello") // helloworld
 * ```
 */
fun <A, B, C> flip(f: ((A) -> (B) -> C)) = cardinal<A, B, C>()(f)
