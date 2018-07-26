package kombinators.birds

/**
 * T combinator - thrush
 */
fun <A, B> thrush(): (A) -> ((A) -> B) -> B =
    { x -> { f -> f(x) } }

