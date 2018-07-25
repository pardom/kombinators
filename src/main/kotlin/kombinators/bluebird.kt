package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// B combinator - bluebird

fun <A, B, C> B(): ((B) -> C) -> ((A) -> B) -> (A) -> C =
    { f -> { g -> { c -> f(g(c)) } } }

fun <A, B, C> bluebird() = B<A, B, C>()

fun <A, B, C> compose() = B<A, B, C>()
