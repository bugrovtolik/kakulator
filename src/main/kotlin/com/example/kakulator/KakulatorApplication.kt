package com.example.kakulator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KakulatorApplication

fun main(args: Array<String>) {
    runApplication<KakulatorApplication>(*args)
}
