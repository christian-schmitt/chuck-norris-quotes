package guru.springframework.chucknorrisquotes;

import guru.springframework.chucknorrisquotes.config.ConfigProperties;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JokeApplicationTests {

    @Autowired
    ConfigProperties configProperties;
    @Test
    void contextLoads() {
    }

    @Test
    void testStuff() {
        Assert.assertNotNull(configProperties);
    }
}
