package kombinators.birds

/**
 * D2 combinator - dovekie
 */
fun <A, B, C, D, E> dovekie(): ((C) -> (D) -> E) -> ((A) -> C) -> (A) -> ((B) -> D) -> (B) -> E =
    { f -> { g -> { x -> { h -> { z -> f(g(x))(h(z)) } } } } }
