package kombinators.birds

/**
 * Φ combinator
 */
fun <A, B, C, D> phoenix(): ((B) -> (C) -> D) -> ((A) -> B) -> ((A) -> C) -> (A) -> D =
    { f -> { g -> { h -> { x -> f(g(x))(h(x)) } } } }
