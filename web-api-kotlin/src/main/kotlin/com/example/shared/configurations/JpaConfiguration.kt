package com.example.shared.configurations

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories(basePackages = ["com.example.infra.databases.repositories"])
@EnableJpaAuditing
@Configuration
class JpaConfiguration {
}