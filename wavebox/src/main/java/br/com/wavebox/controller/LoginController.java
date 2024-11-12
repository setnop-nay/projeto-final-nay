package br.com.wavebox.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    // Página de login
    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error) {
        if (error != null) {
            // Caso o login falhe
            return "login";  // Exibe a página de login novamente
        }
        return "login";  // Exibe a página de login
    }

    // Página de logout
    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";  // Redireciona para a página principal após logout
    }
    @GetMapping("/home")
    public String home() {
        return "home";  // Redireciona para a página principal após logout
    }
    @GetMapping("/registro")
    public String registro() {
        return "registro";  // Redireciona para a página principal após logout
    }
    
    
    //adicionei depois, pode apagar se precisar 
    @PostMapping("/login")
    public String login(@RequestParam String cpf, 
                        @RequestParam String password, 
                        RedirectAttributes redirectAttributes) {
        // Aqui você deve validar o usuário e a senha
        boolean isAuthenticated = authenticateUser (cpf, password); // Método fictício

        if (isAuthenticated) {
            return "redirect:/dashboard"; // Redireciona para a página de dashboard
        } else {
            redirectAttributes.addAttribute("error", true);
            return "redirect:/login"; // Redireciona de volta para a página de login com erro
        }

}

	private boolean authenticateUser(String cpf, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}


