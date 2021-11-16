/*
 * RedisConfiguration.java
 *
 * Copyright by Axon Ivy (Lucerne), all rights reserved.
 */
package com.example.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@ComponentScan("com.example.redis")
@EnableRedisRepositories(basePackages = "com.example.redis.repo")
@PropertySource("classpath:application.properties")
public class RedisConfig {

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        return new JedisConnectionFactory();
    }
}
