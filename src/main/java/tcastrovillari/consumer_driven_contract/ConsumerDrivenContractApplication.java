package tcastrovillari.consumer_driven_contract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerDrivenContractApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerDrivenContractApplication.class, args);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("http://localhost:8081/endpoint", Object.class);
    }

}
