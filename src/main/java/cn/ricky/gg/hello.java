package cn.ricky.gg;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("/hello/{name}")
    String Hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
