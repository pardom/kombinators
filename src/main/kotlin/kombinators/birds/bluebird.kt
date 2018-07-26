package kombinators.birds

/**
 * B combinator - bluebird
 *
 * Example:
 *
 * ```
 * >>> val times2 = { x: Int -> x * 2 }
 * >>> val minus1 = { x: Int -> x - 1 }
 * >>> val minus1times2 = bluebird<Int, Int, Int>()(times2)(minus1)
 * >>> minus1times2(3)
 * 4
 * ```
 */
fun <A, B, C> bluebird(): ((B) -> C) -> ((A) -> B) -> (A) -> C = { f -> { g -> { c -> f(g(c)) } } }

