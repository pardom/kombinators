package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// KI combinator - kite

fun <A, B> KI(): (A) -> (B) -> B =
    { _ -> { b -> b } }

fun <A, B> kite() = KI<A, B>()