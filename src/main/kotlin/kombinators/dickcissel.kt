package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// D1 combinator - dickcissel

fun <A, B, C, D, E> D1(): ((A) -> (B) -> (D) -> E) -> (A) -> (B) -> ((C) -> D) -> (C) -> E =
    { f -> { x -> { y -> { g -> { z -> f(x)(y)(g(z)) } } } } }

fun <A, B, C, D, E> dickcissel() = D1<A, B, C, D, E>()
