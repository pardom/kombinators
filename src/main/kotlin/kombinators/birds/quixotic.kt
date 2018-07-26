package kombinators.birds

/**
 * Q1 combinator - quixotic bird
 */
fun <A, B, C> quixotic(): ((B) -> C) -> (A) -> ((A) -> B) -> C =
    { f -> { x -> { g -> f(g(x)) } } }
