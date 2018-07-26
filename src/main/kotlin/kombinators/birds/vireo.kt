package kombinators.birds

/**
 * V combinator
 */
fun <A, B, C> vireo(): (A) -> (B) -> ((A) -> (B) -> C) -> C =
    { x -> { y -> { f -> f(x)(y) } } }

/**
 * V* combinator
 */
fun <A, B, D> vireoStar(): ((B) -> (A) -> (B) -> D) -> (A) -> (B) -> (B) -> D =
    { f -> { x -> { y -> { z -> f(y)(x)(z) } } } }

/**
 * V** combinator
 */
fun <A, B, C, E> vireoStarStar(): ((A) -> (C) -> (B) -> (C) -> E) -> (A) -> (B) -> (C) -> (C) -> E =
    { f -> { s -> { t -> { u -> { v -> f(s)(v)(t)(u) } } } } }
