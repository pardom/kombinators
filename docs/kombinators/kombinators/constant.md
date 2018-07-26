[kombinators](../index.md) / [kombinators](index.md) / [constant](./constant.md)

# constant

`fun <A> constant(): (`[`A`](constant.md#A)`) -> (`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?) -> `[`A`](constant.md#A)

constant()(x) is a unary function which evaluates to x for all inputs.

The overloaded version of this function is preferred as is supports type inference.

Example:

``` kotlin
constant<String>()("bird")("cat") // bird
```

`fun <A> constant(a: `[`A`](constant.md#A)`): (`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?) -> `[`A`](constant.md#A)

constant(x) is a unary function which evaluates to x for all inputs.

Example:

``` kotlin
constant("bird")("cat") // bird
```

