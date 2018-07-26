package kombinators

/**
 * K combinator - kestrel
 */
fun <A, B> kestrel(): (A) -> (B) -> A =
    { a -> { _ -> a } }

/**
 * K combinator - kestrel
 */
fun <A, B> constant() = kestrel<A, B>()
