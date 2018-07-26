package kombinators.birds

/**
 * Q combinator - queer bird
 */
fun <A, B, C> queer(): ((A) -> B) -> ((B) -> C) -> (A) -> C =
    { f -> { g -> { x -> g(f(x)) } } }

