package kombinators

/**
 * J combinator - jay
 */
fun <A, B> jay(): ((A) -> (B) -> B) -> (A) -> (B) -> (A) -> B =
    { f -> { x -> { y -> { z -> f(x)(f(z)(y)) } } } }

/**
 * Alternative J combinator - jalt
 */
fun <A, B, C> jalt(): ((A) -> C) -> (A) -> (B) -> C =
    { f -> { x -> { _ -> f(x) } } }

/**
 * J' combinator - jalt
 */
fun <A, B, C, D> jaltPrime(): ((A) -> (B) -> D) -> (A) -> (B) -> (C) -> D =
    { f -> { x -> { y -> { _ -> f(x)(y) } } } }
