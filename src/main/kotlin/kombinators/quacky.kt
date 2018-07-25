package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// Q4 combinator - quacky bird

fun <A, B, C> Q4(): (A) -> ((A) -> B) -> ((B) -> C) -> C =
    { x -> { f -> { g -> g(f(x)) } } }

fun <A, B, C> quacky() = Q4<A, B, C>()
