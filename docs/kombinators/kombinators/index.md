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
| [apply](apply.md) | `fun <A, B> apply(): ((`[`A`](apply.md#A)`) -> `[`B`](apply.md#B)`) -> (`[`A`](apply.md#A)`) -> `[`B`](apply.md#B)<br>I* combinator - identity bird once removed |
| [compose](compose.md) | `fun <A, B, C> compose(): ((`[`B`](compose.md#B)`) -> `[`C`](compose.md#C)`) -> ((`[`A`](compose.md#A)`) -> `[`B`](compose.md#B)`) -> (`[`A`](compose.md#A)`) -> `[`C`](compose.md#C)<br>Function composition. |
| [constant](constant.md) | `fun <A, B> constant(): (`[`A`](constant.md#A)`) -> (`[`B`](constant.md#B)`) -> `[`A`](constant.md#A)<br>`fun <A, B> constant(a: `[`A`](constant.md#A)`): (`[`B`](constant.md#B)`) -> `[`A`](constant.md#A)<br>K combinator - kestrel |
| [flip](flip.md) | `fun <A, B, C> flip(): ((`[`A`](flip.md#A)`) -> (`[`B`](flip.md#B)`) -> `[`C`](flip.md#C)`) -> (`[`B`](flip.md#B)`) -> (`[`A`](flip.md#A)`) -> `[`C`](flip.md#C)<br>C combinator - cardinal |
| [identity](identity.md) | `fun <A> identity(): (`[`A`](identity.md#A)`) -> `[`A`](identity.md#A)<br>I combinator - identity bird / idiot bird |
| [reverseApply](reverse-apply.md) | `fun <A, B> reverseApply(): (`[`A`](reverse-apply.md#A)`) -> ((`[`A`](reverse-apply.md#A)`) -> `[`B`](reverse-apply.md#B)`) -> `[`B`](reverse-apply.md#B)<br>`infix fun <A, B> `[`A`](reverse-apply.md#A)`.reverseApply(f: (`[`A`](reverse-apply.md#A)`) -> `[`B`](reverse-apply.md#B)`): `[`B`](reverse-apply.md#B)<br>T combinator - thrush |
| [reverseCompose](reverse-compose.md) | `fun <A, B, C> reverseCompose(): ((`[`A`](reverse-compose.md#A)`) -> `[`B`](reverse-compose.md#B)`) -> ((`[`B`](reverse-compose.md#B)`) -> `[`C`](reverse-compose.md#C)`) -> (`[`A`](reverse-compose.md#A)`) -> `[`C`](reverse-compose.md#C)<br>Reversed function composition. |
| [substitution](substitution.md) | `fun <A, B, C> substitution(): ((`[`A`](substitution.md#A)`) -> (`[`B`](substitution.md#B)`) -> `[`C`](substitution.md#C)`) -> ((`[`A`](substitution.md#A)`) -> `[`B`](substitution.md#B)`) -> (`[`A`](substitution.md#A)`) -> `[`C`](substitution.md#C)<br>S combinator - starling |
