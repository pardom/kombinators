[kombinators](../index.md) / [kombinators](index.md) / [flip](./flip.md)

# flip

`fun <A, B, C> flip(): ((`[`A`](flip.md#A)`) -> (`[`B`](flip.md#B)`) -> `[`C`](flip.md#C)`) -> (`[`B`](flip.md#B)`) -> (`[`A`](flip.md#A)`) -> `[`C`](flip.md#C)

flip f takes its (first) two arguments in the reverse order of f.

The overloaded version of this function is preferred as is supports type inference.

Example:

``` kotlin
val concat = { x -> { y -> x + y } }
flip<String, String, String>()(concat)("word")("hello") // helloworld
```

`fun <A, B, C> flip(f: (`[`A`](flip.md#A)`) -> (`[`B`](flip.md#B)`) -> `[`C`](flip.md#C)`): (`[`B`](flip.md#B)`) -> (`[`A`](flip.md#A)`) -> `[`C`](flip.md#C)

flip f takes its (first) two arguments in the reverse order of f.

Example:

``` kotlin
val concat = { x -> { y -> x + y } }
flip(concat)("word")("hello") // helloworld
```

