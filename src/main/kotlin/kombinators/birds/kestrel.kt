package kombinators.birds

/**
 * K combinator - kestrel
 */
fun <A, B> kestrel(): (A) -> (B) -> A =
    { a -> { _ -> a } }

