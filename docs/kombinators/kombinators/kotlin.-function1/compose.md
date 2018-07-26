[kombinators](../../index.md) / [kombinators](../index.md) / [kotlin.Function1](index.md) / [compose](./compose.md)

# compose

`infix fun <A, B, C> ((`[`B`](compose.md#B)`) -> `[`C`](compose.md#C)`).compose(g: (`[`A`](compose.md#A)`) -> `[`B`](compose.md#B)`): (`[`A`](compose.md#A)`) -> `[`C`](compose.md#C)

Function composition.

Example:

``` kotlin
val times2 = { x: Int -> x * 2 }
val minus1 = { x: Int -> x - 1 }
val minus1times2 = times2 compose minus1

minus1times2(3) // 4
```

