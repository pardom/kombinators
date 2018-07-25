package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// B3 combinator - becard

fun <A, B, C, D> B3(): ((C) -> D) -> ((B) -> C) -> ((A) -> B) -> (A) -> D =
    { f -> { g -> { h -> { x -> f(g(h(x))) } } } }

fun <A, B, C, D> becard() = B3<A, B, C, D>()
