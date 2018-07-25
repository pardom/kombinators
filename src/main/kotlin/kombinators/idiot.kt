package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// I combinator - identity bird / idiot bird

fun <A> I(): (A) -> A =
    { a -> a }

fun <A> idiot() = I<A>()

fun <A> identity() = I<A>()

fun <A> id() = I<A>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// I* combinator - identity bird once removed

fun <A, B> IStar(): ((A) -> B) -> (A) -> B =
    { f -> { a -> f(a) } }

fun <A, B> idiotStar() = IStar<A, B>()

fun <A, B> applicator() = IStar<A, B>()

fun <A, B> apply() = IStar<A, B>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// I* combinator - identity bird twice removed

fun <A, B, C> IStarStar(): ((A) -> (B) -> C) -> (A) -> (B) -> C =
    { f -> { x -> { y -> f(x)(y) } } }

fun <A, B, C> idiotStarStar() = IStarStar<A, B, C>()

