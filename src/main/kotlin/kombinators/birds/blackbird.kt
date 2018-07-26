package kombinators.birds

/**
 * B1 combinator - blackbird
 *
 * Example:
 *
 * ```
 * >>> val invert = { x
 * blackbird(){x -> x * -1}{x -> { y -> x + y } }(3)(5)
 * -8
 * ```
 */
fun <A, B, C, D> blackbird(): ((C) -> D) -> ((A) -> (B) -> C) -> (A) -> (B) -> D =
    { f -> { g -> { x -> { y -> f(g(x)(y)) } } } }
