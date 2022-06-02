package com.minh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class xcontroller {
	@RequestMapping("/index")
	public String x() {
		return "x";
	}
}
