package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// D2 combinator - dovekie

fun <A, B, C, D, E> D2(): ((C) -> (D) -> E) -> ((A) -> C) -> (A) -> ((B) -> D) -> (B) -> E =
    { f -> { g -> { x -> { h -> { z -> f(g(x))(h(z)) } } } } }

fun <A, B, C, D, E> dovekie() = D2<A, B, C, D, E>()
