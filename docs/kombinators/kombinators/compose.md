[kombinators](../index.md) / [kombinators](index.md) / [compose](./compose.md)

# compose

`fun <A, B, C> compose(): ((`[`B`](compose.md#B)`) -> `[`C`](compose.md#C)`) -> ((`[`A`](compose.md#A)`) -> `[`B`](compose.md#B)`) -> (`[`A`](compose.md#A)`) -> `[`C`](compose.md#C) [(source)](https://github.com/pardom/kombinators/tree/master/src/main/kotlin/kombinators/compose.kt#L20)

Function composition.

The infix version of this function is preferred as is supports type inference.

Example:

``` kotlin
val times2 = { x: Int -> x * 2 }
val minus1 = { x: Int -> x - 1 }
val minus1times2 = compose<Int, Int, Int>()(times2)(minus1)
minus1times2(3) // 4
```

