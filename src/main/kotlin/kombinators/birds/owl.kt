package kombinators.birds

/**
 * O combinator
 */
fun <A, B> owl(): (((A) -> B) -> A) -> ((A) -> B) -> B =
    { x -> { y -> y(x(y)) } }
