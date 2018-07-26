package kombinators

import kombinators.birds.kestrel

/**
 * K combinator - kestrel
 */
fun <A, B> constant() = kestrel<A, B>()

/**
 * K combinator - kestrel
 */
fun <A, B> constant(a: A) = kestrel<A, B>()(a)
