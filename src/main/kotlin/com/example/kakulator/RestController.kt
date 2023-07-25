package com.example.kakulator

import org.springframework.core.io.ClassPathResource
import org.springframework.expression.spel.standard.SpelExpressionParser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class RestController {
    var result: Any? = null

    @GetMapping("/")
    fun kalkulator() = ClassPathResource("kalkulator.html").inputStream.readBytes()

    @PostMapping("/kalkulate")
    fun kalkulate(@RequestBody display: String) {
        result = SpelExpressionParser().parseExpression(display).value
    }

    @GetMapping("/result")
    fun kalkulate (): Any? {
        return result
    }
}