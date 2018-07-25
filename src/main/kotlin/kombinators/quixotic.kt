package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// Q1 combinator - quixotic bird

fun <A, B, C> Q1(): ((B) -> C) -> (A) -> ((A) -> B) -> C =
    { f -> { x -> { g -> f(g(x)) } } }

fun <A, B, C> quixotic() = Q1<A, B, C>()