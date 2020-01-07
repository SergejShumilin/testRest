package com.epam.esm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Configuration
@ComponentScan(basePackages = "com.epam.esm")
public class SpringAppConfiguration {

}
