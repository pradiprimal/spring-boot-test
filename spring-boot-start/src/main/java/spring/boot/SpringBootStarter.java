package spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * @author Pradip
 */
@SpringBootApplication
public class SpringBootStarter extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarter.class, args);
    }
    
     @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootStarter.class);
    }
}
