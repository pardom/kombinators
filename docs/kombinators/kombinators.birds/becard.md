[kombinators](../index.md) / [kombinators.birds](index.md) / [becard](./becard.md)

# becard

`fun <A, B, C, D> becard(): ((`[`C`](becard.md#C)`) -> `[`D`](becard.md#D)`) -> ((`[`B`](becard.md#B)`) -> `[`C`](becard.md#C)`) -> ((`[`A`](becard.md#A)`) -> `[`B`](becard.md#B)`) -> (`[`A`](becard.md#A)`) -> `[`D`](becard.md#D)

B3 combinator or function composition (for three functions)

Example:

``` kotlin
val flip = { x -> x * -1 }
val times2 = { x -> x * 2 }
val minus1 = { x -> x - 1 }
val minus1times2flip = becard<Int, Int, Int, Int>()(flip)(times2)(minus1)

minus1times2fip(3) // -4
```

