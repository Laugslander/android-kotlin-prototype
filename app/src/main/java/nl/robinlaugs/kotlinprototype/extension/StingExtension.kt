package nl.robinlaugs.kotlinprototype.extension

fun String.Companion.addFast(string: String): String = format("Fast %s", string)
