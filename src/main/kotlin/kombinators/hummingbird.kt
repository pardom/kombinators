package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// H combinator - hummingbird

fun <A, B, C> H(): ((A) -> (B) -> (A) -> C) -> (A) -> (B) -> C =
    { f -> { x -> { y -> f(x)(y)(x) } } }

fun <A, B, C> hummingbird() = H<A, B, C>()
