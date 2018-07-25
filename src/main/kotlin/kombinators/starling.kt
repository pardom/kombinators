package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// S combinator - starling

fun <A, B, C> S(): ((A) -> (B) -> C) -> ((A) -> B) -> (A) -> C =
    { f -> { g -> { x -> f(x)(g(x)) } } }

fun <A, B, C> starling() = S<A, B, C>()

fun <A, B, C> substitution() = S<A, B, C>()

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// S' combinator - starling prime

fun <A, B, C, D> SPrime(): ((B) -> (C) -> D) -> ((A) -> B) -> ((A) -> C) -> (A) -> D =
    { f -> { g -> { h -> { x -> f(g(x))(h(x)) } } } }

fun <A, B, C, D> starlingPrime() = SPrime<A, B, C, D>()
