[kombinators](../index.md) / [kombinators](index.md) / [blackbird](./blackbird.md)

# blackbird

`fun <A, B, C, D> blackbird(): ((`[`C`](blackbird.md#C)`) -> `[`D`](blackbird.md#D)`) -> ((`[`A`](blackbird.md#A)`) -> (`[`B`](blackbird.md#B)`) -> `[`C`](blackbird.md#C)`) -> (`[`A`](blackbird.md#A)`) -> (`[`B`](blackbird.md#B)`) -> `[`D`](blackbird.md#D)

B1 combinator - blackbird

Example:

```
>>> val invert = { x
blackbird(){x -> x * -1}{x -> { y -> x + y } }(3)(5)
-8
```

