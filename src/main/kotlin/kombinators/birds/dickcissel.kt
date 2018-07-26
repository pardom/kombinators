package kombinators.birds

/**
 * D1 combinator
 */
fun <A, B, C, D, E> dickcissel(): ((A) -> (B) -> (D) -> E) -> (A) -> (B) -> ((C) -> D) -> (C) -> E =
    { f -> { x -> { y -> { g -> { z -> f(x)(y)(g(z)) } } } } }
