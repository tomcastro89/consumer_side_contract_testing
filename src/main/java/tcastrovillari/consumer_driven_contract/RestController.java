package tcastrovillari.consumer_driven_contract;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/endpoint")
    public ResponseEntity endpoint(){
        return ResponseEntity.ok().build();
    }
}
