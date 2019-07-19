# Time expressions

El ejemplo consiste en una **TimeExpression** (o expresión temporal). Esta admite la programación de distintos tipos de recurrencia. 

A continuación se detallan los test realizados para verificar la recurrencia mencionada anteriormente, indicando el nombre de cada uno para su rápida ubicación en la clase de test:

- El evento sucede en un momento especifico (**testOnDate**).
- El evento se repite en forma diaria (**testRecursEveryDay**).
- El evento se repite cada dos días (**testRecursEveryTwoDays**).
- El evento se repite el segundo día de cada mes (**testRecursEveryMonthTheSecondDay**).
- El evento se repite cada dos meses, el segundo día del mes (**testRecursEveryTwoMonthsTheSeconthDay**).
- El evento se repite el primer viernes de cada mes (**testRecursEveryMonthTheFirstFriday**).
- El evento se repite el último viernes de cada mes (**testRecursEveryMonthTheLastFriday**).
- El evento se repite en forma anual, el día 8 de agosto de cada año (**testRecursEveryAugustTheEight**).

## Notas

Este ejercicio fue desarrollado con la técnica de Test Driven Development (**TDD**), teniendo siempre presente generar una pieza de software que cumpla con los principios **SOLID** y **GRASP**, para que el código sea limpio y eficiente.

Por otro lado, es importante aclarar que la implementación fue realizada en **Java 8**, haciendo uso principalmente del **Date API** incluido en esta versión.

Licencia MIT
----
**Para uso totalmente libre**, incluyendo el uso dentro de Software propietario.



