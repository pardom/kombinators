[kombinators](../index.md) / [kombinators](index.md) / [apply](./apply.md)

# apply

`fun <A, B> apply(): ((`[`A`](apply.md#A)`) -> `[`B`](apply.md#B)`) -> (`[`A`](apply.md#A)`) -> `[`B`](apply.md#B) [(source)](https://github.com/pardom/kombinators/tree/master/src/main/kotlin/kombinators/apply.kt#L18)

Extracts the value of a function.

The infix version of this function is preferred as is supports type inference.

Example:

``` kotlin
val plus1 = { x: Int -> x + 1 }
apply(plus1)(3) // 4
```

