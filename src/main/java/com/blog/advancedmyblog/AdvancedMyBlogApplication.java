package com.blog.advancedmyblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AdvancedMyBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvancedMyBlogApplication.class, args);
    }

}
