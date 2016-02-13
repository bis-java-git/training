package co.softwarehouse.training.web.controller;

import co.softwarehouse.training.domain.datatables.DataTablesToObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hemant joshi on 02/03/14.
 */
public abstract class BaseController {

    public static final String DATE_FORMAT = "dd-MM-yyyy";

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        dateFormat.setLenient(false);
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));

        // Convert multipart object to byte[]
        webDataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
    }

    public String toJson(DataTablesToObject<?> dt) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(dt);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class ResourceNotFoundException extends RuntimeException {
    }
}
