package com.example.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author yuweijun
 * @since 2019-12-16
 */
public class HomeController extends AbstractController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception {
        LOGGER.info("date : {}", new Date());
        ModelAndView model = new ModelAndView("index");
        model.addObject("message", "hello world");

        return model;
    }

}
