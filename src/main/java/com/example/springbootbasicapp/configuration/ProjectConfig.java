package com.example.springbootbasicapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.example.springbootbasicapp")
public class ProjectConfig {
}
