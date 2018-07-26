package kombinators

/**
 * Q4 combinator - quacky bird
 */
fun <A, B, C> quacky(): (A) -> ((A) -> B) -> ((B) -> C) -> C =
    { x -> { f -> { g -> g(f(x)) } } }
