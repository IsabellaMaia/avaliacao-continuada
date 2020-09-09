package br.com.bandtec.springconsultoria;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/consultoria")
public class ConsultoriaController {

        private List<Consultor> consul = new ArrayList<>();

        @GetMapping("/hallFuncionarios")
        public List<Consultor> getConsul() {
            return consul;
        }

        
        @PostMapping("/cadastro")
            public void cadastrarFuncionario (@RequestBody Consultor novoConsul){
            consul.add(novoConsul);
        }

        @DeleteMapping("/demitir/{id}")
             public void demitirFuncionario(@PathVariable int id){
            consul.remove(id-1);
        }


    }




