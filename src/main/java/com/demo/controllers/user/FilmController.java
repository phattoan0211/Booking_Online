package com.demo.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "film"})
public class FilmController {

	@GetMapping(value = { "", "comingsoon", "/" })
	public String index() {
		return "film/comingsoon";
	}
	@GetMapping(value = { "", "nowshowing", "/" })
	public String nowshowing() {
		return "film/nowshowing";
	}
	
	
	 
}
