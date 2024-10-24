package br.com.wavebox.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
