package ocean.cms.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/common/index")
    public String index() {
        return "index";
    }

    @GetMapping("/say")
    public String say() {
        return "say";
    }
}
