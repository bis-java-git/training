package co.softwarehouse.training.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hemant joshi on 12/07/2015.
 * Agile Framework Team
 */
@Controller
public class TestingController extends BaseController {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    //    var url="/trainingapp/testing/"+team+"/"+colour+"/"+luckyNumber;

    @RequestMapping(value = "/testing/{team}/{colour}/{number}", method = RequestMethod.GET)
    public
    @ResponseBody
    String process(final @PathVariable String team,
               final @PathVariable String colour,
               final @PathVariable Integer number) {

        String message ="Bad Choice "+ team;
        if (number > 0) {
            message = "Good choice " + team + " with colour " + colour + " with number " + number;
        }
        return message;
    }

}
