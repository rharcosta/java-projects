package springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SalesApplication {

    //vai pegar o valor que está no application.properties e vai colocar dentro da variável applicationName
    @Value("${application.name}")
    private String applicationName;

    @Dog
    private Animal animal;

    @Bean(name = "executeAnimal")
    public CommandLineRunner execute(){
        return args -> {
            this.animal.makeNoise();
        };
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(SalesApplication.class, args);
    }
}
