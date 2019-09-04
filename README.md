# Bluemessaging Kotlin Bootcamp

This repository contains a few Kotlin examples that can help developers that are
new to Kotlin wrap their heads around most of the key Kotlin idioms, practices,
etc.

It was developed by Daniel Aragon (@tormenteddan) as a tool to teach the kotlin
lang to fellow developers.

## Included demos

All demos are exposed via the `blue-kotlin` command (installation instructions
can be found in the install section).

### Safe error handling (`parseints`)

This demo uses a simple implementation of the widely known `Either` functional
type which provides a way to (disjoint-ly) merge two types into one. Error
handling is a popular use case for this type, and by convention, when using it
that way, the Left type represents the error cases, whereas the Right type
contains the success values (see
[this](http://bit.ly/bm-kotlin-bootcamp-either-1) article).

The `parseints` demo, uses this type in order to provide consistent return types 
throughout the execution of the application. Plus, using kotlin's
[sealed classes](http://bit.ly/bm-kotlin-bootcamp-sealed-classes) we
can exhaustively pattern-match within `when` expressions! Furthermore, using an
enum class, we increase developer happiness by using a super-simple exception 
handler.

In this demo we also showcase the usefulness of
[covariant](http://bit.ly/bm-kotlin-bootcamp-generics) generic types,
[string templates](http://bit.ly/bm-kotlin-bootcamp-string-templates),
[smart casts](http://bit.ly/bm-kotlin-bootcamp-smart-casts),
the [elvis operator](http://bit.ly/bm-kotlin-bootcamp-elvis-operator),
[data classes](http://bit.ly/bm-kotlin-bootcamp-data-classes),
[default arguments](http://bit.ly/bm-kotlin-bootcamp-default-arguments),
[named arguments](http://bit.ly/bm-kotlin-bootcamp-named-arguments)
[destructuring declarations](http://bit.ly/bm-kotlin-bootcamp-multi-declarations)
and the [`when`](http://bit.ly/bm-kotlin-bootcamp-when-expression) expressions.

