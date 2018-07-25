package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// R combinator - robin

fun <A, B, C> R(): (A) -> ((B) -> (A) -> C) -> (B) -> C =
    { x -> { f -> { y -> f(y)(x) } } }

fun <A, B, C> robin() = R<A, B, C>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// R* combinator - robin once removed

fun <A, B, C, D> RStar(): ((B) -> (C) -> (A) -> D) -> (A) -> (B) -> (C) -> D =
    { f -> { x -> { y -> { z -> f(y)(z)(x) } } } }

fun <A, B, C, D> robinStar() = RStar<A, B, C, D>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// R** combinator - robin twice removed

fun <A, B, C, D, E> RStarStar(): ((A) -> (C) -> (D) -> (B) -> E) -> (A) -> (B) -> (C) -> (D) -> E =
    { f -> { s -> { t -> { u -> { v -> f(s)(u)(v)(t) } } } } }

fun <A, B, C, D, E> robinStarStar() = RStarStar<A, B, C, D, E>()
