package kombinators

/**
 * T combinator - thrush
 */
fun <A, B> thrush(): (A) -> ((A) -> B) -> B =
    { x -> { f -> f(x) } }

/**
 * T combinator - thrush
 */
fun <A, B> reverseApply() = thrush<A, B>()
