package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// C combinator - cardinal

fun <A, B, C> C(): ((A) -> (B) -> C) -> (B) -> (A) -> C =
    { f -> { x -> { y -> f(y)(x) } } }

fun <A, B, C> cardinal() = C<A, B, C>()

fun <A, B, C> flip() = C<A, B, C>()

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// C' combinator - no name

fun <A, B, C, D> CPrime(): ((C) -> (A) -> D) -> ((B) -> C) -> (A) -> (B) -> D =
    { f -> { g -> { x -> { y -> f(g(y))(x) } } } }

fun <A, B, C> cardinalPrime() = C<A, B, C>()

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// C* combinator - cardinal once removed

fun <A, B, C, D> CStar(): ((A) -> (C) -> (B) -> D) -> (A) -> (B) -> (C) -> D =
    { f -> { x -> { y -> { z -> f(x)(z)(y) } } } }

fun <A, B, C, D> cardinalStar() = CStar<A, B, C, D>()

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// C** combinator - cardinal twice removed

fun <A, B, C, D, E> CStarStar(): ((A) -> (B) -> (D) -> (C) -> E) -> (A) -> (B) -> (C) -> (D) -> E =
    { f -> { s -> { t -> { u -> { v -> f(s)(t)(v)(u) } } } } }

fun <A, B, C, D, E> cardinalStarStar() = CStarStar<A, B, C, D, E>()
