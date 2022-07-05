package sawant.mihir.simplerestservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    /*
        This is a better approach as we mark class with RestController, so to tell
        the Spring that this class is both Controller and all the methods in this
        class are going to return Rest Http Response and not a view.

        We can say RestController = Controller + ResponseBody
     */

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }


    @GetMapping("/hi")
    public String welcome(){
        return "Hi";
    }
}
