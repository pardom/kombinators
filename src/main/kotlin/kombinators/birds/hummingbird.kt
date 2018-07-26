package kombinators.birds

/**
 * H combinator
 */
fun <A, B, C> hummingbird(): ((A) -> (B) -> (A) -> C) -> (A) -> (B) -> C =
    { f -> { x -> { y -> f(x)(y)(x) } } }
