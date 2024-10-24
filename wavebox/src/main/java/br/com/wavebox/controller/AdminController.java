package br.com.wavebox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	 @GetMapping("/admin")
	    public String admin() {
	        return "admin";  // Redireciona para a página principal após logout
	    }
}
