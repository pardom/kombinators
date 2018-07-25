package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Q combinator - queer bird

fun <A, B, C> Q(): ((A) -> B) -> ((B) -> C) -> (A) -> C =
    { f -> { g -> { x -> g(f(x)) } } }

fun <A, B, C> queer() = Q<A, B, C>()

fun <A, B, C> reverseCompose() = Q<A, B, C>()
