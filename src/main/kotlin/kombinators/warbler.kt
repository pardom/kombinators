package kombinators

/**
 * W combinator - warbler - elementary duplicator
 */
fun <A, B> warbler(): ((A) -> (A) -> B) -> (A) -> B =
    { f -> { x -> f(x)(x) } }

/**
 * W1 combinator - converse warbler
 */
fun <A, B> warbler1(): (A) -> ((A) -> (A) -> B) -> B =
    { x -> { f -> f(x)(x) } }

/**
 * W* combinator - warbler once removed
 */
fun <A, B, C> warblerStar(): ((A) -> (B) -> (B) -> C) -> (A) -> (B) -> C =
    { f -> { x -> { y -> f(x)(y)(y) } } }

/**
 * W combinator - warbler twice removed
 */
fun <A, B, C, D> warblerStarStar(): ((A) -> (B) -> (C) -> (C) -> D) -> (A) -> (B) -> (C) -> D =
    { f -> { x -> { y -> { z -> f(x)(y)(z)(z) } } } }
