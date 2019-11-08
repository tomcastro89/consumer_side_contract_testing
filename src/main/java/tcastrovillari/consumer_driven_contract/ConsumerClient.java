package tcastrovillari.consumer_driven_contract;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerClient {

    public HttpStatus consumeEndpoint() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object> exchange = restTemplate.exchange("http://localhost:8081/endpoint", HttpMethod.GET, HttpEntity.EMPTY, Object.class);
        return exchange.getStatusCode();
    }
}
