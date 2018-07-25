package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// B1 combinator - blackbird

fun <A, B, C, D> B1(): ((C) -> D) -> ((A) -> (B) -> C) -> (A) -> (B) -> D =
    { f -> { g -> { x -> { y -> f(g(x)(y)) } } } }

fun <A, B, C, D> blackbird() = B1<A, B, C, D>()
