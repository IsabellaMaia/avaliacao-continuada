package br.com.bandtec.springconsultoria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

public class Consultor extends Funcionario {



    private String perfil;


    public Consultor(String nome, Double salario, String projetoAtuante, Integer cargaHoraria, Double promocao, String perfil) {
        super(nome, salario, projetoAtuante, cargaHoraria, promocao);
        this.perfil = perfil;

    }

    @RestController
    @RequestMapping("/consultoria")
    public class ConsultoriaController {
        private List<Consultor> consul = new ArrayList<>();

        @GetMapping("/hallFuncionarios")

        public List<Consultor> getConsul() {
            return consul;
        }
    }

    public Double getValorRecebidoHora() {
        return getSalario()/(getCargaHoraria()*22);
    }





    public String getPerfil() {
        return perfil;
    }



    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }


    public Double salarioTotal(){
        return getSalario()+getPromocao();
    }

    @Override
    public String toString() {
        return "Consultor{" +
                "perfil='" + perfil + '\'' +
                ", salárioTotal=" +  salarioTotal()+
                "} " + super.toString();
    }
}

