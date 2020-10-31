package com.vv.blogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

// excluding hibernate auto-configuration
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class BloggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BloggerApplication.class, args);
    }
}
