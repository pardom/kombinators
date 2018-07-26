package kombinators

/**
 * KI combinator - kite
 */
fun <A, B> kite(): (A) -> (B) -> B =
    { _ -> { b -> b } }
