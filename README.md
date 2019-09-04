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

### Working with streams (`happybirthday`)

This demo uses a really simple User DTO; compared to its Java counterpart, this
data class is tiny (reduces ~50 lines of code to just 1) and provides more
features. Using the `useLines` method, we can work with every line in a file as
a stream of strings, which can then be mapped to other data types and filtered
accordingly before reaching a terminal operation where the stream is consumed,
and the file is closed.

The demo uses kotlin's
[lambda notation](http://bit.ly/bm-kotlin-bootcamp-lambdas) to quickly process a
file of records in a declarative (and very readable) syntax. Plus, using
Kotlin's [ranges](http://bit.ly/bm-kotlin-bootcamp-ranges), we can very clearly
test if a date is within a certain range. Furthermore, by using the
[`if`](http://bit.ly/bm-kotlin-bootcamp-if-expression) expression as a
statement, we can make very readable conditional assignments.

In this demo we also showcase the usefulness of
[extension functions](http://bit.ly/bm-kotlin-bootcamp-extension-functions),
[string templates](http://bit.ly/bm-kotlin-bootcamp-string-templates) and the
the [elvis operator](http://bit.ly/bm-kotlin-bootcamp-elvis-operator).

## Installation instructions

Use [Gradle]() to install the application:

```bash
$ ./gradlew install
```

This will install the application inside `./build/install/blue-kotlin`. Lastly,
add the `bin` folder within said directory to your `PATH` and enjoy!

## Usage

Simply run the blue-kotlin command (or any of its subcommands) with the `-h`
flag and help will come your way:

```
Usage: blue-kotlin [OPTIONS] COMMAND [ARGS]...

  Bluemessaging Kotlin Bootcamp utility

Options:
  -h, --help  Show this message and exit

Commands:
  parseints      Parse a list of integers
  happybirthday  Wishes you and/or your coworkers happy birthday!

This command provides a way to run a few Kotlin examples that can help
developers that are new to Kotlin wrap their heads around most of the key
Kotlin idioms, practices,etc.

It was developed by Daniel Aragon (laragon@bluemessaging.com) as a tool to
teach the kotlin lang to fellow developers.
```

### parseints

```
Usage: blue-kotlin parseints [OPTIONS] [integers]...

  Parse a list of integers

Options:
  -h, --help  Show this message and exit

Arguments:
  integers  a list of integers
```

### happybirthday

```
Usage: blue-kotlin happybirthday [OPTIONS]

  Wishes you and/or your coworkers happy birthday!

Options:
  --me TEXT...  Use this option to provide your name, the day and the month of
                your birthday. E.g: if your name is Daniel and your birthday
                is on the 9th of December, input "Daniel 9 12"
  -h, --help    Show this message and exit
```

## Further Reading

Kotlin Koans is a series of exercises to get you familiar with the Kotlin syntax
and some idioms. Each exercise is created as a failing unit test, and your job
is to make it pass. [Here](https://play.kotlinlang.org/koans/overview) you can
play with Koans online.

Kotlin Koans is one of the most popular and most effective ways to get into
Kotlin for people who already know Java. In just a few hours, you'll feel able
to write idiomatic Kotlin code.

Make sure to check it out!