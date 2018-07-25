package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// V combinator - vireo (pairing)

fun <A, B, C> V(): (A) -> (B) -> ((A) -> (B) -> C) -> C =
    { x -> { y -> { f -> f(x)(y) } } }

fun <A, B, C> vireo() = V<A, B, C>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// V* combinator - vireo once removed

fun <A, B, C, D> VStar(): ((B) -> (A) -> (B) -> D) -> (A) -> (B) -> (B) -> D =
    { f -> { x -> { y -> { z -> f(y)(x)(z) } } } }

fun <A, B, C, D> vireoStar() = VStar<A, B, C, D>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// V** combinator - vireo twice removed

fun <A, B, C, D, E> VStarStar(): ((A) -> (C) -> (B) -> (C) -> E) -> (A) -> (B) -> (C) -> (C) -> E =
    { f -> { s -> { t -> { u -> { v -> f(s)(v)(t)(u) } } } } }

fun <A, B, C, D, E> vireoStarStar() = VStarStar<A, B, C, D, E>()