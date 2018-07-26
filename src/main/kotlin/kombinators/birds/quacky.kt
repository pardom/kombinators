package kombinators.birds

/**
 * Q4 combinator
 */
fun <A, B, C> quacky(): (A) -> ((A) -> B) -> ((B) -> C) -> C =
    { x -> { f -> { g -> g(f(x)) } } }
