package ru.romanow.asyncapi.server

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import
import org.springframework.test.context.ActiveProfiles
import ru.romanow.asyncapi.server.config.KafkaTestConfiguration

@ActiveProfiles("test")
@SpringBootTest
@Import(value = [KafkaTestConfiguration::class])
class EchoServerApplicationTest {

    @Test
    fun test() {
    }
}
