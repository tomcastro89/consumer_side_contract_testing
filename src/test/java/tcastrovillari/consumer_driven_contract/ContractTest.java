package tcastrovillari.consumer_driven_contract;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"tcastrovillari:producer:+:stubs:8081"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class ContractTest {

    @Autowired
    private ConsumerClient consumerClient;

    @Test
    public void contractVerifierTest() {
        assertEquals(HttpStatus.OK, consumerClient.consumeEndpoint());
    }
}
