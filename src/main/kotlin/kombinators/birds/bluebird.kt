package kombinators.birds

/**
 * B combinator
 */
fun <A, B, C> bluebird(): ((B) -> C) -> ((A) -> B) -> (A) -> C = { f -> { g -> { c -> f(g(c)) } } }

