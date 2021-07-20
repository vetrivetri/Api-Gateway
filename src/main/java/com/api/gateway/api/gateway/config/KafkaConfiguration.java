package com.api.gateway.api.gateway.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.logging.kafka.producer.kafkaproducer.*")
public class KafkaConfiguration {
}
