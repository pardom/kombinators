package kombinators.birds

/**
 * B3 combinator
 */
fun <A, B, C, D> becard(): ((C) -> D) -> ((B) -> C) -> ((A) -> B) -> (A) -> D =
    { f -> { g -> { h -> { x -> f(g(h(x))) } } } }
