package guru.springframework.chucknorrisquotes;

import guru.springframework.chucknorrisquotes.config.ConfigProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@SpringBootApplication
//@ImportResource("classpath:chuck-config.xml")
@ImportResource(locations = {"classpath:chuck-config.xml"})
public class JokeApplication {

    final ConfigProperties configProperties;

    public JokeApplication(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(JokeApplication.class, args);
    }

}
