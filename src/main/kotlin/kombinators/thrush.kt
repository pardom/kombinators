package kombinators

////////////////////////////////////////////////////////////////////////////////////////////////////
// T combinator - thrush

fun <A, B> T(): (A) -> ((A) -> B) -> B =
    { x -> { f -> f(x) } }

fun <A, B> thrush() = T<A, B>()

fun <A, B> reverseApplicator() = T<A, B>()

fun <A, B> reverseApply() = T<A, B>()
