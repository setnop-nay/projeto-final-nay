package br.com.wavebox.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.wavebox.model.User;

@Controller
public abstract class UsuarioController {
	
    @PostMapping(value="/cadastrar_usuario")
    public ModelAndView cadastrarUsuario(
    		@ModelAttribute("user") User user,
    		RedirectAttributes atributes) 
	{ 			
    	System.out.println("Mundo bita");
				//redirecina para o método getmapping
				ModelAndView mv = new ModelAndView("redirect:/registro");
				// mensagem = setorService.Save(setorModel);
				// atributes.addFlashAttribute("mensagem", mensagem);
				
				return mv;
		
	}
      
    @PostMapping(value="/save_usuario")
    public abstract ModelAndView usersave(
 @ModelAttribute("user") User user,
 RedirectAttributes atributes);

}
