package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// F combinator - finch

fun <A, B, C> F(): (A) -> (B) -> ((B) -> (A) -> C) -> C =
    { x -> { y -> { f -> f(y)(x) } } }

fun <A, B, C> finch() = F<A, B, C>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// F* combinator - finch once removed

fun <A, B, C> FStar(): (A) -> (B) -> ((B) -> (A) -> C) -> C =
    { x -> { y -> { f -> f(y)(x) } } }

fun <A, B, C> finchStar() = F<A, B, C>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// F** combinator - finch star

fun <A, B, C> FStarStar(): (A) -> (B) -> ((B) -> (A) -> C) -> C =
    { x -> { y -> { f -> f(y)(x) } } }

fun <A, B, C> finchStarStar() = F<A, B, C>()