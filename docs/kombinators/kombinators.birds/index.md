[kombinators](../index.md) / [kombinators.birds](./index.md)

## Package kombinators.birds

### Functions

| Name | Summary |
|---|---|
| [badleagle](badleagle.md) | `fun <A, B, C, D, E, F, G> badleagle(): ((`[`E`](badleagle.md#E)`) -> (`[`F`](badleagle.md#F)`) -> `[`G`](badleagle.md#G)`) -> ((`[`A`](badleagle.md#A)`) -> (`[`B`](badleagle.md#B)`) -> `[`E`](badleagle.md#E)`) -> (`[`A`](badleagle.md#A)`) -> (`[`B`](badleagle.md#B)`) -> ((`[`C`](badleagle.md#C)`) -> (`[`D`](badleagle.md#D)`) -> `[`F`](badleagle.md#F)`) -> (`[`C`](badleagle.md#C)`) -> (`[`D`](badleagle.md#D)`) -> `[`G`](badleagle.md#G)<br>Ê combinator - bald eagle |
| [becard](becard.md) | `fun <A, B, C, D> becard(): ((`[`C`](becard.md#C)`) -> `[`D`](becard.md#D)`) -> ((`[`B`](becard.md#B)`) -> `[`C`](becard.md#C)`) -> ((`[`A`](becard.md#A)`) -> `[`B`](becard.md#B)`) -> (`[`A`](becard.md#A)`) -> `[`D`](becard.md#D)<br>B3 combinator or function composition (for three functions) |
| [blackbird](blackbird.md) | `fun <A, B, C, D> blackbird(): ((`[`C`](blackbird.md#C)`) -> `[`D`](blackbird.md#D)`) -> ((`[`A`](blackbird.md#A)`) -> (`[`B`](blackbird.md#B)`) -> `[`C`](blackbird.md#C)`) -> (`[`A`](blackbird.md#A)`) -> (`[`B`](blackbird.md#B)`) -> `[`D`](blackbird.md#D)<br>B1 combinator - blackbird |
| [bluebird](bluebird.md) | `fun <A, B, C> bluebird(): ((`[`B`](bluebird.md#B)`) -> `[`C`](bluebird.md#C)`) -> ((`[`A`](bluebird.md#A)`) -> `[`B`](bluebird.md#B)`) -> (`[`A`](bluebird.md#A)`) -> `[`C`](bluebird.md#C)<br>B combinator - bluebird |
| [bunting](bunting.md) | `fun <A, B, C, D, E> bunting(): ((`[`D`](bunting.md#D)`) -> `[`E`](bunting.md#E)`) -> ((`[`A`](bunting.md#A)`) -> (`[`B`](bunting.md#B)`) -> (`[`C`](bunting.md#C)`) -> `[`D`](bunting.md#D)`) -> (`[`A`](bunting.md#A)`) -> (`[`B`](bunting.md#B)`) -> (`[`C`](bunting.md#C)`) -> `[`E`](bunting.md#E)<br>B2 combinator - bunting |
| [cardinal](cardinal.md) | `fun <A, B, C> cardinal(): ((`[`A`](cardinal.md#A)`) -> (`[`B`](cardinal.md#B)`) -> `[`C`](cardinal.md#C)`) -> (`[`B`](cardinal.md#B)`) -> (`[`A`](cardinal.md#A)`) -> `[`C`](cardinal.md#C)<br>C combinator - cardinal |
| [cardinalPrime](cardinal-prime.md) | `fun <A, B, C, D> cardinalPrime(): ((`[`C`](cardinal-prime.md#C)`) -> (`[`A`](cardinal-prime.md#A)`) -> `[`D`](cardinal-prime.md#D)`) -> ((`[`B`](cardinal-prime.md#B)`) -> `[`C`](cardinal-prime.md#C)`) -> (`[`A`](cardinal-prime.md#A)`) -> (`[`B`](cardinal-prime.md#B)`) -> `[`D`](cardinal-prime.md#D)<br>C' combinator - no name |
| [cardinalStar](cardinal-star.md) | `fun <A, B, C, D> cardinalStar(): ((`[`A`](cardinal-star.md#A)`) -> (`[`C`](cardinal-star.md#C)`) -> (`[`B`](cardinal-star.md#B)`) -> `[`D`](cardinal-star.md#D)`) -> (`[`A`](cardinal-star.md#A)`) -> (`[`B`](cardinal-star.md#B)`) -> (`[`C`](cardinal-star.md#C)`) -> `[`D`](cardinal-star.md#D)<br>C* combinator - cardinal once removed |
| [cardinalStarStar](cardinal-star-star.md) | `fun <A, B, C, D, E> cardinalStarStar(): ((`[`A`](cardinal-star-star.md#A)`) -> (`[`B`](cardinal-star-star.md#B)`) -> (`[`D`](cardinal-star-star.md#D)`) -> (`[`C`](cardinal-star-star.md#C)`) -> `[`E`](cardinal-star-star.md#E)`) -> (`[`A`](cardinal-star-star.md#A)`) -> (`[`B`](cardinal-star-star.md#B)`) -> (`[`C`](cardinal-star-star.md#C)`) -> (`[`D`](cardinal-star-star.md#D)`) -> `[`E`](cardinal-star-star.md#E)<br>C** combinator - cardinal twice removed |
| [dickcissel](dickcissel.md) | `fun <A, B, C, D, E> dickcissel(): ((`[`A`](dickcissel.md#A)`) -> (`[`B`](dickcissel.md#B)`) -> (`[`D`](dickcissel.md#D)`) -> `[`E`](dickcissel.md#E)`) -> (`[`A`](dickcissel.md#A)`) -> (`[`B`](dickcissel.md#B)`) -> ((`[`C`](dickcissel.md#C)`) -> `[`D`](dickcissel.md#D)`) -> (`[`C`](dickcissel.md#C)`) -> `[`E`](dickcissel.md#E)<br>D1 combinator - dickcissel |
| [dove](dove.md) | `fun <A, B, C, D> dove(): ((`[`A`](dove.md#A)`) -> (`[`C`](dove.md#C)`) -> `[`D`](dove.md#D)`) -> (`[`A`](dove.md#A)`) -> ((`[`B`](dove.md#B)`) -> `[`C`](dove.md#C)`) -> (`[`B`](dove.md#B)`) -> `[`D`](dove.md#D)<br>D combinator - dove |
| [dovekie](dovekie.md) | `fun <A, B, C, D, E> dovekie(): ((`[`C`](dovekie.md#C)`) -> (`[`D`](dovekie.md#D)`) -> `[`E`](dovekie.md#E)`) -> ((`[`A`](dovekie.md#A)`) -> `[`C`](dovekie.md#C)`) -> (`[`A`](dovekie.md#A)`) -> ((`[`B`](dovekie.md#B)`) -> `[`D`](dovekie.md#D)`) -> (`[`B`](dovekie.md#B)`) -> `[`E`](dovekie.md#E)<br>D2 combinator - dovekie |
| [eagle](eagle.md) | `fun <A, B, C, D, E> eagle(): ((`[`A`](eagle.md#A)`) -> (`[`D`](eagle.md#D)`) -> `[`E`](eagle.md#E)`) -> (`[`A`](eagle.md#A)`) -> ((`[`B`](eagle.md#B)`) -> (`[`C`](eagle.md#C)`) -> `[`D`](eagle.md#D)`) -> (`[`B`](eagle.md#B)`) -> (`[`C`](eagle.md#C)`) -> `[`E`](eagle.md#E)<br>E combinator - eagle |
| [finch](finch.md) | `fun <A, B, C> finch(): (`[`A`](finch.md#A)`) -> (`[`B`](finch.md#B)`) -> ((`[`B`](finch.md#B)`) -> (`[`A`](finch.md#A)`) -> `[`C`](finch.md#C)`) -> `[`C`](finch.md#C)<br>F combinator - finch |
| [finchStar](finch-star.md) | `fun <A, B, C> finchStar(): (`[`A`](finch-star.md#A)`) -> (`[`B`](finch-star.md#B)`) -> ((`[`B`](finch-star.md#B)`) -> (`[`A`](finch-star.md#A)`) -> `[`C`](finch-star.md#C)`) -> `[`C`](finch-star.md#C)<br>F* combinator - finch once removed |
| [finchStarStar](finch-star-star.md) | `fun <A, B, C> finchStarStar(): (`[`A`](finch-star-star.md#A)`) -> (`[`B`](finch-star-star.md#B)`) -> ((`[`B`](finch-star-star.md#B)`) -> (`[`A`](finch-star-star.md#A)`) -> `[`C`](finch-star-star.md#C)`) -> `[`C`](finch-star-star.md#C)<br>F** combinator - finch star |
| [goldfinch](goldfinch.md) | `fun <A, B, C, D> goldfinch(): ((`[`B`](goldfinch.md#B)`) -> (`[`C`](goldfinch.md#C)`) -> `[`D`](goldfinch.md#D)`) -> ((`[`A`](goldfinch.md#A)`) -> `[`C`](goldfinch.md#C)`) -> (`[`A`](goldfinch.md#A)`) -> (`[`B`](goldfinch.md#B)`) -> `[`D`](goldfinch.md#D)<br>G combinator - goldfinch |
| [hummingbird](hummingbird.md) | `fun <A, B, C> hummingbird(): ((`[`A`](hummingbird.md#A)`) -> (`[`B`](hummingbird.md#B)`) -> (`[`A`](hummingbird.md#A)`) -> `[`C`](hummingbird.md#C)`) -> (`[`A`](hummingbird.md#A)`) -> (`[`B`](hummingbird.md#B)`) -> `[`C`](hummingbird.md#C)<br>H combinator - hummingbird |
| [idiot](idiot.md) | `fun <A> idiot(): (`[`A`](idiot.md#A)`) -> `[`A`](idiot.md#A)<br>I combinator - identity bird / idiot bird |
| [idiotStar](idiot-star.md) | `fun <A, B> idiotStar(): ((`[`A`](idiot-star.md#A)`) -> `[`B`](idiot-star.md#B)`) -> (`[`A`](idiot-star.md#A)`) -> `[`B`](idiot-star.md#B)<br>I* combinator - identity bird once removed |
| [idiotStarStar](idiot-star-star.md) | `fun <A, B, C> idiotStarStar(): ((`[`A`](idiot-star-star.md#A)`) -> (`[`B`](idiot-star-star.md#B)`) -> `[`C`](idiot-star-star.md#C)`) -> (`[`A`](idiot-star-star.md#A)`) -> (`[`B`](idiot-star-star.md#B)`) -> `[`C`](idiot-star-star.md#C)<br>I* combinator - identity bird twice removed |
| [jalt](jalt.md) | `fun <A, B, C> jalt(): ((`[`A`](jalt.md#A)`) -> `[`C`](jalt.md#C)`) -> (`[`A`](jalt.md#A)`) -> (`[`B`](jalt.md#B)`) -> `[`C`](jalt.md#C)<br>Alternative J combinator - jalt |
| [jaltPrime](jalt-prime.md) | `fun <A, B, C, D> jaltPrime(): ((`[`A`](jalt-prime.md#A)`) -> (`[`B`](jalt-prime.md#B)`) -> `[`D`](jalt-prime.md#D)`) -> (`[`A`](jalt-prime.md#A)`) -> (`[`B`](jalt-prime.md#B)`) -> (`[`C`](jalt-prime.md#C)`) -> `[`D`](jalt-prime.md#D)<br>J' combinator - jalt |
| [jay](jay.md) | `fun <A, B> jay(): ((`[`A`](jay.md#A)`) -> (`[`B`](jay.md#B)`) -> `[`B`](jay.md#B)`) -> (`[`A`](jay.md#A)`) -> (`[`B`](jay.md#B)`) -> (`[`A`](jay.md#A)`) -> `[`B`](jay.md#B)<br>J combinator - jay |
| [kestrel](kestrel.md) | `fun <A, B> kestrel(): (`[`A`](kestrel.md#A)`) -> (`[`B`](kestrel.md#B)`) -> `[`A`](kestrel.md#A)<br>K combinator - kestrel |
| [kite](kite.md) | `fun <A, B> kite(): (`[`A`](kite.md#A)`) -> (`[`B`](kite.md#B)`) -> `[`B`](kite.md#B)<br>KI combinator - kite |
| [owl](owl.md) | `fun <A, B> owl(): (((`[`A`](owl.md#A)`) -> `[`B`](owl.md#B)`) -> `[`A`](owl.md#A)`) -> ((`[`A`](owl.md#A)`) -> `[`B`](owl.md#B)`) -> `[`B`](owl.md#B)<br>O combinator - owl |
| [phoenix](phoenix.md) | `fun <A, B, C, D> phoenix(): ((`[`B`](phoenix.md#B)`) -> (`[`C`](phoenix.md#C)`) -> `[`D`](phoenix.md#D)`) -> ((`[`A`](phoenix.md#A)`) -> `[`B`](phoenix.md#B)`) -> ((`[`A`](phoenix.md#A)`) -> `[`C`](phoenix.md#C)`) -> (`[`A`](phoenix.md#A)`) -> `[`D`](phoenix.md#D)<br>Φ combinator - phoenix |
| [quacky](quacky.md) | `fun <A, B, C> quacky(): (`[`A`](quacky.md#A)`) -> ((`[`A`](quacky.md#A)`) -> `[`B`](quacky.md#B)`) -> ((`[`B`](quacky.md#B)`) -> `[`C`](quacky.md#C)`) -> `[`C`](quacky.md#C)<br>Q4 combinator - quacky bird |
| [queer](queer.md) | `fun <A, B, C> queer(): ((`[`A`](queer.md#A)`) -> `[`B`](queer.md#B)`) -> ((`[`B`](queer.md#B)`) -> `[`C`](queer.md#C)`) -> (`[`A`](queer.md#A)`) -> `[`C`](queer.md#C)<br>Q combinator - queer bird |
| [quirky](quirky.md) | `fun <A, B, C> quirky(): ((`[`A`](quirky.md#A)`) -> `[`B`](quirky.md#B)`) -> (`[`A`](quirky.md#A)`) -> ((`[`B`](quirky.md#B)`) -> `[`C`](quirky.md#C)`) -> `[`C`](quirky.md#C)<br>Q3 combinator - quirky bird |
| [quixotic](quixotic.md) | `fun <A, B, C> quixotic(): ((`[`B`](quixotic.md#B)`) -> `[`C`](quixotic.md#C)`) -> (`[`A`](quixotic.md#A)`) -> ((`[`A`](quixotic.md#A)`) -> `[`B`](quixotic.md#B)`) -> `[`C`](quixotic.md#C)<br>Q1 combinator - quixotic bird |
| [quizzical](quizzical.md) | `fun <A, B, C> quizzical(): (`[`A`](quizzical.md#A)`) -> ((`[`B`](quizzical.md#B)`) -> `[`C`](quizzical.md#C)`) -> ((`[`A`](quizzical.md#A)`) -> `[`B`](quizzical.md#B)`) -> `[`C`](quizzical.md#C)<br>Q2 combinator - quizzical bird |
| [robin](robin.md) | `fun <A, B, C> robin(): (`[`A`](robin.md#A)`) -> ((`[`B`](robin.md#B)`) -> (`[`A`](robin.md#A)`) -> `[`C`](robin.md#C)`) -> (`[`B`](robin.md#B)`) -> `[`C`](robin.md#C)<br>R combinator - robin |
| [robinStar](robin-star.md) | `fun <A, B, C, D> robinStar(): ((`[`B`](robin-star.md#B)`) -> (`[`C`](robin-star.md#C)`) -> (`[`A`](robin-star.md#A)`) -> `[`D`](robin-star.md#D)`) -> (`[`A`](robin-star.md#A)`) -> (`[`B`](robin-star.md#B)`) -> (`[`C`](robin-star.md#C)`) -> `[`D`](robin-star.md#D)<br>R* combinator - robin once removed |
| [robinStarStar](robin-star-star.md) | `fun <A, B, C, D, E> robinStarStar(): ((`[`A`](robin-star-star.md#A)`) -> (`[`C`](robin-star-star.md#C)`) -> (`[`D`](robin-star-star.md#D)`) -> (`[`B`](robin-star-star.md#B)`) -> `[`E`](robin-star-star.md#E)`) -> (`[`A`](robin-star-star.md#A)`) -> (`[`B`](robin-star-star.md#B)`) -> (`[`C`](robin-star-star.md#C)`) -> (`[`D`](robin-star-star.md#D)`) -> `[`E`](robin-star-star.md#E)<br>R** combinator - robin twice removed |
| [starling](starling.md) | `fun <A, B, C> starling(): ((`[`A`](starling.md#A)`) -> (`[`B`](starling.md#B)`) -> `[`C`](starling.md#C)`) -> ((`[`A`](starling.md#A)`) -> `[`B`](starling.md#B)`) -> (`[`A`](starling.md#A)`) -> `[`C`](starling.md#C)<br>S combinator - starling |
| [starlingPrime](starling-prime.md) | `fun <A, B, C, D> starlingPrime(): ((`[`B`](starling-prime.md#B)`) -> (`[`C`](starling-prime.md#C)`) -> `[`D`](starling-prime.md#D)`) -> ((`[`A`](starling-prime.md#A)`) -> `[`B`](starling-prime.md#B)`) -> ((`[`A`](starling-prime.md#A)`) -> `[`C`](starling-prime.md#C)`) -> (`[`A`](starling-prime.md#A)`) -> `[`D`](starling-prime.md#D)<br>S' combinator - starling prime |
| [thrush](thrush.md) | `fun <A, B> thrush(): (`[`A`](thrush.md#A)`) -> ((`[`A`](thrush.md#A)`) -> `[`B`](thrush.md#B)`) -> `[`B`](thrush.md#B)<br>T combinator - thrush |
| [vireo](vireo.md) | `fun <A, B, C> vireo(): (`[`A`](vireo.md#A)`) -> (`[`B`](vireo.md#B)`) -> ((`[`A`](vireo.md#A)`) -> (`[`B`](vireo.md#B)`) -> `[`C`](vireo.md#C)`) -> `[`C`](vireo.md#C)<br>V combinator - vireo (pairing) |
| [vireoStar](vireo-star.md) | `fun <A, B, D> vireoStar(): ((`[`B`](vireo-star.md#B)`) -> (`[`A`](vireo-star.md#A)`) -> (`[`B`](vireo-star.md#B)`) -> `[`D`](vireo-star.md#D)`) -> (`[`A`](vireo-star.md#A)`) -> (`[`B`](vireo-star.md#B)`) -> (`[`B`](vireo-star.md#B)`) -> `[`D`](vireo-star.md#D)<br>V* combinator - vireo once removed |
| [vireoStarStar](vireo-star-star.md) | `fun <A, B, C, E> vireoStarStar(): ((`[`A`](vireo-star-star.md#A)`) -> (`[`C`](vireo-star-star.md#C)`) -> (`[`B`](vireo-star-star.md#B)`) -> (`[`C`](vireo-star-star.md#C)`) -> `[`E`](vireo-star-star.md#E)`) -> (`[`A`](vireo-star-star.md#A)`) -> (`[`B`](vireo-star-star.md#B)`) -> (`[`C`](vireo-star-star.md#C)`) -> (`[`C`](vireo-star-star.md#C)`) -> `[`E`](vireo-star-star.md#E)<br>V** combinator - vireo twice removed |
| [warbler](warbler.md) | `fun <A, B> warbler(): ((`[`A`](warbler.md#A)`) -> (`[`A`](warbler.md#A)`) -> `[`B`](warbler.md#B)`) -> (`[`A`](warbler.md#A)`) -> `[`B`](warbler.md#B)<br>W combinator - warbler - elementary duplicator |
| [warbler1](warbler1.md) | `fun <A, B> warbler1(): (`[`A`](warbler1.md#A)`) -> ((`[`A`](warbler1.md#A)`) -> (`[`A`](warbler1.md#A)`) -> `[`B`](warbler1.md#B)`) -> `[`B`](warbler1.md#B)<br>W1 combinator - converse warbler |
| [warblerStar](warbler-star.md) | `fun <A, B, C> warblerStar(): ((`[`A`](warbler-star.md#A)`) -> (`[`B`](warbler-star.md#B)`) -> (`[`B`](warbler-star.md#B)`) -> `[`C`](warbler-star.md#C)`) -> (`[`A`](warbler-star.md#A)`) -> (`[`B`](warbler-star.md#B)`) -> `[`C`](warbler-star.md#C)<br>W* combinator - warbler once removed |
| [warblerStarStar](warbler-star-star.md) | `fun <A, B, C, D> warblerStarStar(): ((`[`A`](warbler-star-star.md#A)`) -> (`[`B`](warbler-star-star.md#B)`) -> (`[`C`](warbler-star-star.md#C)`) -> (`[`C`](warbler-star-star.md#C)`) -> `[`D`](warbler-star-star.md#D)`) -> (`[`A`](warbler-star-star.md#A)`) -> (`[`B`](warbler-star-star.md#B)`) -> (`[`C`](warbler-star-star.md#C)`) -> `[`D`](warbler-star-star.md#D)<br>W combinator - warbler twice removed |