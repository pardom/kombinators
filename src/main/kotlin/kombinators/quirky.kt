package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// Q3 combinator - quirky bird

fun <A, B, C> Q3(): ((A) -> B) -> (A) -> ((B) -> C) -> C =
    { f -> { x -> { g -> g(f(x)) } } }

fun <A, B, C> quirky() = Q3<A, B, C>()
