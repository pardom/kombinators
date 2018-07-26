package kombinators.birds

/**
 * T combinator
 */
fun <A, B> thrush(): (A) -> ((A) -> B) -> B =
    { x -> { f -> f(x) } }

