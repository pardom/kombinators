package kombinators.birds

/**
 * Q3 combinator
 */
fun <A, B, C> quirky(): ((A) -> B) -> (A) -> ((B) -> C) -> C =
    { f -> { x -> { g -> g(f(x)) } } }
