package kombinators

/**
 * Q3 combinator - quirky bird
 */
fun <A, B, C> quirky(): ((A) -> B) -> (A) -> ((B) -> C) -> C =
    { f -> { x -> { g -> g(f(x)) } } }
