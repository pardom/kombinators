package kombinators

/**
 * R combinator - robin
 */
fun <A, B, C> robin(): (A) -> ((B) -> (A) -> C) -> (B) -> C =
    { x -> { f -> { y -> f(y)(x) } } }

/**
 * R* combinator - robin once removed
 */
fun <A, B, C, D> robinStar(): ((B) -> (C) -> (A) -> D) -> (A) -> (B) -> (C) -> D =
    { f -> { x -> { y -> { z -> f(y)(z)(x) } } } }

/**
 * R** combinator - robin twice removed
 */
fun <A, B, C, D, E> robinStarStar(): ((A) -> (C) -> (D) -> (B) -> E) -> (A) -> (B) -> (C) -> (D) -> E =
    { f -> { s -> { t -> { u -> { v -> f(s)(u)(v)(t) } } } } }
