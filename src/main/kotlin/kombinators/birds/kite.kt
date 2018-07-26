package kombinators.birds

/**
 * KI combinator
 */
fun <B> kite(): (Any?) -> (B) -> B =
    { _ -> { b -> b } }
