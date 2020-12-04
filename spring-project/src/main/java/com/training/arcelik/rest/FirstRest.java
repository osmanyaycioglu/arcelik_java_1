package com.training.arcelik.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class FirstRest {

    @RequestMapping(method = RequestMethod.GET, path = "/katman/test")
    public String xyz(final Model modelParam) {
        modelParam.addAttribute("abc",
                                "str");
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/test2")
    public ModelAndView xyz2() {
        ModelAndView mw = new ModelAndView("hello");
        mw.addObject("abc",
                     "str");
        return mw;
    }

}
