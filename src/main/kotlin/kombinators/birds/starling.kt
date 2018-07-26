package kombinators.birds

/**
 * S combinator
 */
fun <A, B, C> starling(): ((A) -> (B) -> C) -> ((A) -> B) -> (A) -> C =
    { f -> { g -> { x -> f(x)(g(x)) } } }

/**
 * S' combinator
 */
fun <A, B, C, D> starlingPrime(): ((B) -> (C) -> D) -> ((A) -> B) -> ((A) -> C) -> (A) -> D =
    { f -> { g -> { h -> { x -> f(g(x))(h(x)) } } } }
