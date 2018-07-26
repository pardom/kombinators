package kombinators

import kombinators.birds.idiotStar
import kombinators.birds.thrush

/**
 * I* combinator - identity bird once removed
 */
fun <A, B> apply() = idiotStar<A, B>()

/**
 * I* combinator - identity bird once removed
 */
infix fun <A, B> ((A) -> B).apply(a: A) = idiotStar<A, B>()(this)(a)

/**
 * T combinator - thrush
 */
fun <A, B> reverseApply() = thrush<A, B>()

/**
 * T combinator - thrush
 */
infix fun <A, B> A.reverseApply(f: ((A) -> B)) = thrush<A, B>()(this)(f)
