package br.com.wavebox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {
	 @GetMapping("/produto")
	    public String produto() {
	        return "produto";  
	    }
}
