package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// K combinator - kestrel

fun <A, B> K(): (A) -> (B) -> A =
    { a -> { _ -> a } }

fun <A, B> kestrel() = K<A, B>()

fun <A, B> constant() = K<A, B>()
