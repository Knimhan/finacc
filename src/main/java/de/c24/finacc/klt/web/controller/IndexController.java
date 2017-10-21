package de.c24.finacc.klt.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * IndexController
 *
 */
@Controller
public class IndexController {
    private static final Logger LOGGER = LogManager.getLogger(IndexController.class);

    /**
     * the index page of angular
     *
     * @return index.html file from target/classes/static directory.
     */
    @GetMapping({ "/klt/**" })
    public String index() {
        return "forward:/index.html";
    }

}
