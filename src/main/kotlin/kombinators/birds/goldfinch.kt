package kombinators.birds

/**
 * G combinator - goldfinch
 */
fun <A, B, C, D> goldfinch(): ((B) -> (C) -> D) -> ((A) -> C) -> (A) -> (B) -> D =
    { f -> { g -> { x -> { y -> f(y)(g(x)) } } } }
