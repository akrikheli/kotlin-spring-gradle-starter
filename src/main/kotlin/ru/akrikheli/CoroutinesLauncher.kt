package ru.akrikheli

import kotlinx.coroutines.*
import java.lang.Thread.currentThread

fun main() = runBlocking {
    val count = 100
    // this: CoroutineScope
    val job = launch {
        // launch a new coroutine in the scope of runBlocking
        for (i in 1..count) {
            //delay(10)
            println("[${currentThread().name}] Данный текст")
            println("[${currentThread().name}] нельзя разрывать")
            Thread.sleep(1000)
        }
    }

    for (i in 1..count) {
        println("[${currentThread().name}] #main")
        delay(1000)
    }
    job.join()
}
