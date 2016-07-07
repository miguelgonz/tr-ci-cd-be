package innovation.be.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class TimeController {

    @ResponseBody
    @RequestMapping("/time")
    public String getTime() {
        return new Date().toString();
    }

}
