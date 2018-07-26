package kombinators

/**
 * Q2 combinator - quizzical bird
 */
fun <A, B, C> quizzical(): (A) -> ((B) -> C) -> ((A) -> B) -> C =
    { x -> { f -> { g -> f(g(x)) } } }
