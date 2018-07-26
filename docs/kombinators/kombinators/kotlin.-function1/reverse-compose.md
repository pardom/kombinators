[kombinators](../../index.md) / [kombinators](../index.md) / [kotlin.Function1](index.md) / [reverseCompose](./reverse-compose.md)

# reverseCompose

`infix fun <A, B, C> ((`[`A`](reverse-compose.md#A)`) -> `[`B`](reverse-compose.md#B)`).reverseCompose(g: (`[`B`](reverse-compose.md#B)`) -> `[`C`](reverse-compose.md#C)`): (`[`A`](reverse-compose.md#A)`) -> `[`C`](reverse-compose.md#C)

Reversed function composition.

Example:

``` kotlin
val times2 = { x: Int -> x * 2 }
val minus1 = { x: Int -> x - 1 }
val minus1times2 = minus1 reverseCompose times2

minus1times2(3) // 4
```

