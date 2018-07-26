package kombinators

/**
 * E combinator - eagle
 */
fun <A, B, C, D, E> eagle(): ((A) -> (D) -> E) -> (A) -> ((B) -> (C) -> D) -> (B) -> (C) -> E =
    { f -> { x -> { g -> { y -> { z -> f(x)(g(y)(z)) } } } } }

/**
 * Ê combinator - bald eagle
 */
fun <A, B, C, D, E, F, G> badleagle(): ((E) -> (F) -> G) -> ((A) -> (B) -> E) -> (A) -> (B) -> ((C) -> (D) -> F) -> (C) -> (D) -> G =
    { f -> { g -> { s -> { t -> { h -> { u -> { v -> f(g(s)(t))(h(u)(v)) } } } } } } }
