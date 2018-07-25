package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// G combinator - goldfinch

fun <A, B, C, D> G(): ((B) -> (C) -> D) -> ((A) -> C) -> (A) -> (B) -> D =
    { f -> { g -> { x -> { y -> f(y)(g(x)) } } } }

fun <A, B, C, D> goldfinch() = G<A, B, C, D>()