package demo;

import org.springframcework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class Controller {
    
    @PostMapping("/webhook")
    public ResponseEntity<String> printHandler (@RequestBody String requestBody) {

        System.out.println("##webhook => " + requestBody);

        return new ResponseEntity<String>(requestBody , HttpStatus.OK);

    }
}
