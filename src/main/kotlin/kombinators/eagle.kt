package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// E combinator - eagle

fun <A, B, C, D, E> E(): ((A) -> (D) -> E) -> (A) -> ((B) -> (C) -> D) -> (B) -> (C) -> E =
    { f -> { x -> { g -> { y -> { z -> f(x)(g(y)(z)) } } } } }

fun <A, B, C, D, E> eagle() = E<A, B, C, D, E>()

////////////////////////////////////////////////////////////////////////////////////////////////////
// E^ combinator - bald eagle

fun <A, B, C, D, E, F, G> ECircumflex(): ((E) -> (F) -> G) -> ((A) -> (B) -> E) -> (A) -> (B) -> ((C) -> (D) -> F) -> (C) -> (D) -> G =
    { f -> { g -> { s -> { t -> { h -> { u -> { v -> f(g(s)(t))(h(u)(v)) } } } } } } }

fun <A, B, C, D, E, F, G> baldeagle() = ECircumflex<A, B, C, D, E, F, G>()
