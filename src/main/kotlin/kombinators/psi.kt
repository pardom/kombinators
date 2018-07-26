package kombinators


/**
 * PSI combinator
 */
fun <A, B, C> psi(): ((B) -> (B) -> C) -> ((A) -> B) -> (A) -> (A) -> C =
    { f -> { g -> { x -> { y -> f(g(x))(g(y)) } } } }

