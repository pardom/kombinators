package kombinators

/**
 * B3 combinator or function composition (for three functions)
 *
 * Example:
 *
 * ```kotlin
 * val flip = { x -> x * -1 }
 * val times2 = { x -> x * 2 }
 * val minus1 = { x -> x - 1 }
 * val minus1times2flip = becard<Int, Int, Int, Int>()(flip)(times2)(minus1)
 *
 * minus1times2fip(3) // -4
 * ```
 */
fun <A, B, C, D> becard(): ((C) -> D) -> ((B) -> C) -> ((A) -> B) -> (A) -> D =
    { f -> { g -> { h -> { x -> f(g(h(x))) } } } }
