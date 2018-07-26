package kombinators.birds

/**
 * K combinator
 */
fun <A> kestrel(): (A) -> (Any?) -> A =
    { a -> { _ -> a } }

