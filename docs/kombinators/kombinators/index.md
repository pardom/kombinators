[kombinators](../index.md) / [kombinators](./index.md)

## Package kombinators

Common combinators

### Extensions for External Classes

| Name | Summary |
|---|---|
| [kotlin.Function1](kotlin.-function1/index.md) |  |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun <A, B> apply(): ((`[`A`](apply.md#A)`) -> `[`B`](apply.md#B)`) -> (`[`A`](apply.md#A)`) -> `[`B`](apply.md#B)<br>Extracts the value of a function. |
| [compose](compose.md) | `fun <A, B, C> compose(): ((`[`B`](compose.md#B)`) -> `[`C`](compose.md#C)`) -> ((`[`A`](compose.md#A)`) -> `[`B`](compose.md#B)`) -> (`[`A`](compose.md#A)`) -> `[`C`](compose.md#C)<br>Function composition. |
| [constant](constant.md) | `fun <A> constant(): (`[`A`](constant.md#A)`) -> (`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?) -> `[`A`](constant.md#A)<br>constant()(x) is a unary function which evaluates to x for all inputs.`fun <A> constant(a: `[`A`](constant.md#A)`): (`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?) -> `[`A`](constant.md#A)<br>constant(x) is a unary function which evaluates to x for all inputs. |
| [flip](flip.md) | `fun <A, B, C> flip(): ((`[`A`](flip.md#A)`) -> (`[`B`](flip.md#B)`) -> `[`C`](flip.md#C)`) -> (`[`B`](flip.md#B)`) -> (`[`A`](flip.md#A)`) -> `[`C`](flip.md#C)<br>`fun <A, B, C> flip(f: (`[`A`](flip.md#A)`) -> (`[`B`](flip.md#B)`) -> `[`C`](flip.md#C)`): (`[`B`](flip.md#B)`) -> (`[`A`](flip.md#A)`) -> `[`C`](flip.md#C)<br>flip f takes its (first) two arguments in the reverse order of f. |
| [identity](identity.md) | `fun <A> identity(): (`[`A`](identity.md#A)`) -> `[`A`](identity.md#A)<br>Identity function. |
| [psi](psi.md) | `fun <A, B, C> psi(): ((`[`B`](psi.md#B)`) -> (`[`B`](psi.md#B)`) -> `[`C`](psi.md#C)`) -> ((`[`A`](psi.md#A)`) -> `[`B`](psi.md#B)`) -> (`[`A`](psi.md#A)`) -> (`[`A`](psi.md#A)`) -> `[`C`](psi.md#C)<br>PSI combinator |
| [reverseApply](reverse-apply.md) | `fun <A, B> reverseApply(): (`[`A`](reverse-apply.md#A)`) -> ((`[`A`](reverse-apply.md#A)`) -> `[`B`](reverse-apply.md#B)`) -> `[`B`](reverse-apply.md#B)<br>`infix fun <A, B> `[`A`](reverse-apply.md#A)`.reverseApply(f: (`[`A`](reverse-apply.md#A)`) -> `[`B`](reverse-apply.md#B)`): `[`B`](reverse-apply.md#B)<br>Extracts the value of a function from left to right. |
| [reverseCompose](reverse-compose.md) | `fun <A, B, C> reverseCompose(): ((`[`A`](reverse-compose.md#A)`) -> `[`B`](reverse-compose.md#B)`) -> ((`[`B`](reverse-compose.md#B)`) -> `[`C`](reverse-compose.md#C)`) -> (`[`A`](reverse-compose.md#A)`) -> `[`C`](reverse-compose.md#C)<br>Function composition from left to right. |
