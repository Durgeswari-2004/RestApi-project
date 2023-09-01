package com.ex.Renovation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Application {
@GetMapping("/index")
public String homereno()
{
	return "index";
}
}
