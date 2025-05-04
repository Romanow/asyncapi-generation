package ru.romanow.asyncapi.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EchoClientApplication

fun main(args: Array<String>) {
    runApplication<EchoClientApplication>(*args)
}
