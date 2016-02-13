package co.softwarehouse.training.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: Agile Training
 * Date: 17/03/14
 * Time: 19:03
 */

@Controller
public class CalculatorController extends BaseController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private Double getNumber(final String numberString) {
        double result = 0;
        if (!numberString.isEmpty()) {
            result = Double.parseDouble(numberString);
        }
        return result;
    }

    @RequestMapping(value = "/calc", method = RequestMethod.GET)
    public ModelAndView displayCalc() {

        ModelAndView model = new ModelAndView();
        model.setViewName("calc");
   //     model.addObject("msg", name);

        return model;

    }


    @RequestMapping(value = "/calc/add/{value1String}/{value2String}", method = RequestMethod.GET)
    public
    @ResponseBody
    double add(final @PathVariable String value1String,
               final @PathVariable String value2String) {

        logger.debug("add is called "+ value1String, " "+value2String);
        return getNumber(value1String) + getNumber(value2String);
    }

    @RequestMapping(value = "/calc/subtract/{value1String}/{value2String}", method = RequestMethod.GET)
    public
    @ResponseBody
    double subtract(final @PathVariable String value1String,
               final @PathVariable String value2String) {

        logger.debug("subtract is called "+ value1String, " "+value2String);
        return getNumber(value1String) - getNumber(value2String);
    }

    @RequestMapping(value = "/calc/multiply/{value1String}/{value2String}", method = RequestMethod.GET)
    public
    @ResponseBody
    double multiply(final @PathVariable String value1String,
                    final @PathVariable String value2String) {

        logger.debug("multiply is called "+ value1String, " "+value2String);
        return getNumber(value1String) * getNumber(value2String);
    }

    @RequestMapping(value = "/calc/divide/{value1String}/{value2String}", method = RequestMethod.GET)
    public
    @ResponseBody
    double divide(final @PathVariable String value1String,
                    final @PathVariable String value2String) {

        logger.debug("divide is called "+ value1String, " "+value2String);
        try {
            return getNumber(value1String) / getNumber(value2String);
        } catch (Exception exc) {
            logger.error(exc.getMessage());
        }

        return 0;
    }

}
