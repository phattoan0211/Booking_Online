package com.demo.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({ "cinema"})
public class CinemaController {

	@RequestMapping(value = {"index"}, method = RequestMethod.GET)
	public String index() {
		return "cinema/index";
	}
	 
	 
}
