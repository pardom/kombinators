package kombinators

import kombinators.birds.kestrel

/**
 * constant()(x) is a unary function which evaluates to x for all inputs.
 *
 * The overloaded version of this function is preferred as is supports type inference.
 *
 * Example:
 *
 * ```kotlin
 * constant<String>()("bird")("cat") // bird
 * ```
 */
fun <A> constant() = kestrel<A>()

/**
 * constant(x) is a unary function which evaluates to x for all inputs.
 *
 * Example:
 *
 * ```kotlin
 * constant("bird")("cat") // bird
 * ```
 */
fun <A> constant(a: A) = kestrel<A>()(a)
