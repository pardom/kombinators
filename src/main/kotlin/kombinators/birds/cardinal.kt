package kombinators.birds

/**
 * C combinator
 */
fun <A, B, C> cardinal(): ((A) -> (B) -> C) -> (B) -> (A) -> C =
    { f -> { x -> { y -> f(y)(x) } } }

/**
 * C' combinator
 */
fun <A, B, C, D> cardinalPrime(): ((C) -> (A) -> D) -> ((B) -> C) -> (A) -> (B) -> D =
    { f -> { g -> { x -> { y -> f(g(y))(x) } } } }

/**
 * C* combinator
 */
fun <A, B, C, D> cardinalStar(): ((A) -> (C) -> (B) -> D) -> (A) -> (B) -> (C) -> D =
    { f -> { x -> { y -> { z -> f(x)(z)(y) } } } }

/**
 * C** combinator
 */
fun <A, B, C, D, E> cardinalStarStar(): ((A) -> (B) -> (D) -> (C) -> E) -> (A) -> (B) -> (C) -> (D) -> E =
    { f -> { s -> { t -> { u -> { v -> f(s)(t)(v)(u) } } } } }
