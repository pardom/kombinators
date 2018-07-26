[kombinators](../index.md) / [kombinators.birds](index.md) / [bluebird](./bluebird.md)

# bluebird

`fun <A, B, C> bluebird(): ((`[`B`](bluebird.md#B)`) -> `[`C`](bluebird.md#C)`) -> ((`[`A`](bluebird.md#A)`) -> `[`B`](bluebird.md#B)`) -> (`[`A`](bluebird.md#A)`) -> `[`C`](bluebird.md#C)

B combinator - bluebird

Example:

```
>>> val times2 = { x: Int -> x * 2 }
>>> val minus1 = { x: Int -> x - 1 }
>>> val minus1times2 = bluebird<Int, Int, Int>()(times2)(minus1)
>>> minus1times2(3)
4
```

