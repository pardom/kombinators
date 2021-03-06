package kombinators.birds

/**
 * D combinator
 */
fun <A, B, C, D> dove(): ((A) -> (C) -> D) -> (A) -> ((B) -> C) -> (B) -> D =
    { f -> { x -> { g -> { y -> f(x)(g(y)) } } } }
