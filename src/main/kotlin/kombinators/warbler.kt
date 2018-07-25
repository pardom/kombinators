package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// W combinator - warbler - elementary duplicator

fun <A, B> W(): ((A) -> (A) -> B) -> (A) -> B =
    { f -> { x -> f(x)(x) } }

fun <A, B> warbler() = W<A, B>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// W1 combinator - converse warbler

fun <A, B> W1(): (A) -> ((A) -> (A) -> B) -> B =
    { x -> { f -> f(x)(x) } }

fun <A, B> warbler1() = W<A, B>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// W* combinator - warbler once removed

fun <A, B, C> WStar(): ((A) -> (B) -> (B) -> C) -> (A) -> (B) -> C =
    { f -> { x -> { y -> f(x)(y)(y) } } }

fun <A, B, C> warblerStar() = WStar<A, B, C>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// W combinator - warbler twice removed

fun <A, B, C, D> WStarStar(): ((A) -> (B) -> (C) -> (C) -> D) -> (A) -> (B) -> (C) -> D =
    { f -> { x -> { y -> { z -> f(x)(y)(z)(z) } } } }

fun <A, B, C, D> warblerStarStar() = WStarStar<A, B, C, D>()
