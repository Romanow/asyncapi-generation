package ru.romanow.asyncapi.server.config

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.springframework.context.annotation.Bean
import org.testcontainers.kafka.ConfluentKafkaContainer

@TestConfiguration
class KafkaTestConfiguration {

    @Bean
    @ServiceConnection
    fun kafka() = ConfluentKafkaContainer(KAFKA_IMAGE)

    companion object {
        private const val KAFKA_IMAGE = "confluentinc/cp-kafka:7.7.1"
    }
}
