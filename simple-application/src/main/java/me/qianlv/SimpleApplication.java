package me.qianlv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * "@SpringBootApplication" equivalent to @Configuration, @EnableAutoConfiguration, and @ComponentScan together
 * "@EnableJpaRepositories" to scan the specified package for repositories
 * "@EntityScan" to pick up our JPA entities
 *
 * @author xiaoshu
 */
@EnableJpaRepositories("me.qianlv.repo")
@EntityScan("me.qianlv.model")
@SpringBootApplication
public class SimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }

}
