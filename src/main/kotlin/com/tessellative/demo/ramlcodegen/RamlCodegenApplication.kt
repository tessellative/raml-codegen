package com.tessellative.demo.ramlcodegen

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RamlCodegenApplication

fun main(args: Array<String>) {
    runApplication<RamlCodegenApplication>(*args)
}

inline fun <reified T> logger(from: T): Logger {
    return LoggerFactory.getLogger(T::class.java)
}
