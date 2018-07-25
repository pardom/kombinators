package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Q2 combinator - quizzical bird

fun <A, B, C> Q2(): (A) -> ((B) -> C) -> ((A) -> B) -> C =
    { x -> { f -> { g -> f(g(x)) } } }

fun <A, B, C> quizzical() = Q2<A, B, C>()
