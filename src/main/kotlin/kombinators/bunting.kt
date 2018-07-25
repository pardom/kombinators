package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// B2 combinator - bunting

fun <A, B, C, D, E> B2(): ((D) -> E) -> ((A) -> (B) -> (C) -> D) -> (A) -> (B) -> (C) -> E =
    { f -> { g -> { x -> { y -> { z -> f(g(x)(y)(z)) } } } } }

fun <A, B, C, D, E> bunting() = B2<A, B, C, D, E>()
