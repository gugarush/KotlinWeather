package com.gustavo.kotlinweather

/**
 * Created by gustavo on 02/10/17.
 */
class Person(name: String, surname: String) {
    var name: String = ""
    get() = field.toUpperCase()
    set(value) {
        field = "Name: $value"
    }


}