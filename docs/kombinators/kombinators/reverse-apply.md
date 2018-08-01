[kombinators](../index.md) / [kombinators](index.md) / [reverseApply](./reverse-apply.md)

# reverseApply

`fun <A, B> reverseApply(): (`[`A`](reverse-apply.md#A)`) -> ((`[`A`](reverse-apply.md#A)`) -> `[`B`](reverse-apply.md#B)`) -> `[`B`](reverse-apply.md#B) [(source)](https://github.com/pardom/kombinators/tree/master/src/main/kotlin/kombinators/apply.kt#L44)

Extracts the value of a function from left to right.

The infix version of this function is preferred as is supports type inference.

Example:

``` kotlin
val plus1 = { x: Int -> x + 1 }
reverseApply(3)(plus1) // 4
```

`infix fun <A, B> `[`A`](reverse-apply.md#A)`.reverseApply(f: (`[`A`](reverse-apply.md#A)`) -> `[`B`](reverse-apply.md#B)`): `[`B`](reverse-apply.md#B) [(source)](https://github.com/pardom/kombinators/tree/master/src/main/kotlin/kombinators/apply.kt#L56)

Extracts the value of a function from left to right.

Example:

``` kotlin
val plus1 = { x: Int -> x + 1 }
3 reverseApply plus1 // 4
```

