package kombinators

/**
 * I combinator - identity bird / idiot bird
 */
fun <A> idiot(): (A) -> A =
    { a -> a }

/**
 * I combinator - identity bird / idiot bird
 */
fun <A> identity() = idiot<A>()

/**
 * I* combinator - identity bird once removed
 */
fun <A, B> idiotStar(): ((A) -> B) -> (A) -> B =
    { f -> { a -> f(a) } }

/**
 * I* combinator - identity bird once removed
 */
fun <A, B> apply() = idiotStar<A, B>()

/**
 * I* combinator - identity bird twice removed
 */
fun <A, B, C> idiotStarStar(): ((A) -> (B) -> C) -> (A) -> (B) -> C =
    { f -> { x -> { y -> f(x)(y) } } }

