package com.example.spring.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yuweijun
 * @since 2019-12-16
 */
public class HomeController extends AbstractController {


    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception {

        ModelAndView model = new ModelAndView("index");
        model.addObject("message", "hello world");

        return model;
    }

}
