[kombinators](../index.md) / [kombinators](index.md) / [reverseCompose](./reverse-compose.md)

# reverseCompose

`fun <A, B, C> reverseCompose(): ((`[`A`](reverse-compose.md#A)`) -> `[`B`](reverse-compose.md#B)`) -> ((`[`B`](reverse-compose.md#B)`) -> `[`C`](reverse-compose.md#C)`) -> (`[`A`](reverse-compose.md#A)`) -> `[`C`](reverse-compose.md#C)

Reversed function composition.

The infix version of this function is preferred as is supports type inference.

Example:

``` kotlin
val times2 = { x: Int -> x * 2 }
val minus1 = { x: Int -> x - 1 }
val minus1times2 = reverseCompose <Int, Int, Int>()(minus1)(times2)

minus1times2(3) // 4
```

