package kombinators.birds

/**
 * B1 combinator
 */
fun <A, B, C, D> blackbird(): ((C) -> D) -> ((A) -> (B) -> C) -> (A) -> (B) -> D =
    { f -> { g -> { x -> { y -> f(g(x)(y)) } } } }
