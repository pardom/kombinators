package kombinators

/**
 * F combinator - finch
 */
fun <A, B, C> finch(): (A) -> (B) -> ((B) -> (A) -> C) -> C =
    { x -> { y -> { f -> f(y)(x) } } }

/**
 * F* combinator - finch once removed
 */
fun <A, B, C> finchStar(): (A) -> (B) -> ((B) -> (A) -> C) -> C =
    { x -> { y -> { f -> f(y)(x) } } }

/**
 * F** combinator - finch star
 */
fun <A, B, C> finchStarStar(): (A) -> (B) -> ((B) -> (A) -> C) -> C =
    { x -> { y -> { f -> f(y)(x) } } }
