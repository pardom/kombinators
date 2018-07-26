package kombinators

import kombinators.birds.idiot

/**
 * Identity function.
 *
 * Example:
 *
 * ```kotlin
 * identity<String>()("bird") // bird
 * ```
 */
fun <A> identity() = idiot<A>()

