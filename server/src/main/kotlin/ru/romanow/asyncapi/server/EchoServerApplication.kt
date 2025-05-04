package ru.romanow.asyncapi.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.messaging.handler.annotation.Payload

@SpringBootApplication
class EchoServerApplication(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {
    @KafkaListener(topics = ["echo.request"])
    fun echo(@Payload message: String) {
        kafkaTemplate.send("echo.response", message)
    }
}

fun main(args: Array<String>) {
    runApplication<EchoServerApplication>(*args)
}
