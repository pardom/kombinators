package kombinators

import kombinators.birds.idiot

/**
 * I combinator - identity bird / idiot bird
 */
fun <A> identity() = idiot<A>()

