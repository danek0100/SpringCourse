package org.webapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.webapp")
@PropertySource("classpath:configurations.properties")
public class SpringConfig {

}
