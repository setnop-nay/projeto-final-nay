package br.com.wavebox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	 @GetMapping("/")
	    public String home() {
	        return "home";  // Redireciona para a página principal após logout
	    }
}
