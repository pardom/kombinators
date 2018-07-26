[kombinators](../../index.md) / [kombinators](../index.md) / [kotlin.Function1](index.md) / [apply](./apply.md)

# apply

`infix fun <A, B> ((`[`A`](apply.md#A)`) -> `[`B`](apply.md#B)`).apply(a: `[`A`](apply.md#A)`): `[`B`](apply.md#B)

Extracts the value of a function.

Example:

``` kotlin
val plus1 = { x: Int -> x + 1 }
plus1 apply 3 // 4
```

