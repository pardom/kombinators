package kombinators.birds

/**
 * I combinator
 */
fun <A> idiot(): (A) -> A =
    { a -> a }

/**
 * I* combinator
 */
fun <A, B> idiotStar(): ((A) -> B) -> (A) -> B =
    { f -> { a -> f(a) } }

/**
 * I* combinator
 */
fun <A, B, C> idiotStarStar(): ((A) -> (B) -> C) -> (A) -> (B) -> C =
    { f -> { x -> { y -> f(x)(y) } } }

