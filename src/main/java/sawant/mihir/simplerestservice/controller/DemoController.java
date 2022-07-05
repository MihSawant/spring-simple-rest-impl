package sawant.mihir.simplerestservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Controller
public class DemoController {

    /*
        This particular approach is absolutely correct, as we are defining our
        Controller class and within it, we define two action methods that map
        to the paths and add the ResponseBody annotation so that to tell the
        Dispatcher servlet that we are not rendering any view but an Http Response
        directly
     */

    @GetMapping("/date")
    @ResponseBody
    public String date(){

        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.MEDIUM);
        return LocalDate.now().format(formatter);
    }

    /*
        But problem with this kind of approach is that the code, Clearly we are repeating the
        code and every time we create a method in the controller we will have to do the same
        thing, and it is not a good practice, so we can use the syntax in MainController class.
     */

    @GetMapping("/")
    @ResponseBody
    public String welcome(){
        return "Welcome";
    }
}
