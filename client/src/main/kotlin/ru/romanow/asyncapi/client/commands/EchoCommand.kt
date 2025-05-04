package ru.romanow.asyncapi.client.commands

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod
import org.springframework.shell.standard.ShellOption

@ShellComponent
class EchoCommand(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {

    @ShellMethod(key = ["echo"], value = "Send message to server", prefix = "-")
    fun echo(@ShellOption(defaultValue = "empty") message: String?) {
        kafkaTemplate.send("echo.request", message)
    }
}
