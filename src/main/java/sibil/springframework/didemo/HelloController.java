package sibil.springframework.didemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @RequestMapping("/hello")
    public String sayHello(){
    return "hello";
    }
}