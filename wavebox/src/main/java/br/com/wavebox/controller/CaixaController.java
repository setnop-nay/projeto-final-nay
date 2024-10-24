package br.com.wavebox.controller;

import br.com.wavebox.model.Caixa;
import br.com.wavebox.service.CaixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caixas")
public class CaixaController {

    @Autowired
    private CaixaService caixaService;

    @PostMapping
    public Caixa salvarCaixa(@RequestBody Caixa caixa) {
        return caixaService.salvarCaixa(caixa);
    }

    @GetMapping("/{idCaixa}")
    public Caixa buscarCaixaPorId(@PathVariable Integer idCaixa) {
        return caixaService.buscarCaixaPorId(idCaixa).orElseThrow(() -> new RuntimeException("Caixa não encontrada."));
    }

    @GetMapping
    public List<Caixa> buscarTodasCaixas() {
        return caixaService.buscarTodasCaixas();
    }

    @DeleteMapping("/{idCaixa}")
    public void deletarCaixa(@PathVariable Integer idCaixa) {
        caixaService.deletarCaixa(idCaixa);
    }
}
