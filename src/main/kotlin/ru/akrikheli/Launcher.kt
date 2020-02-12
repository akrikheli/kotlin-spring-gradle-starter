@file:Suppress("SpreadOperator")
package ru.akrikheli

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Launcher

fun main(args: Array<String>) {
    runApplication<Launcher>(*args)
}
