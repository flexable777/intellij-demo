package demo.intellij.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/Hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
