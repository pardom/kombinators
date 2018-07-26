package kombinators

/**
 * D combinator - dove
 */
fun <A, B, C, D> dove(): ((A) -> (C) -> D) -> (A) -> ((B) -> C) -> (B) -> D =
    { f -> { x -> { g -> { y -> f(x)(g(y)) } } } }
