package kombinators.birds

/**
 * Q2 combinator
 */
fun <A, B, C> quizzical(): (A) -> ((B) -> C) -> ((A) -> B) -> C =
    { x -> { f -> { g -> f(g(x)) } } }
