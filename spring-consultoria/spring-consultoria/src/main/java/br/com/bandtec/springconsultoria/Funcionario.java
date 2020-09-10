package br.com.bandtec.springconsultoria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario implements Consultoria {

    private String nome;
    private Double salario;
    private String projetoAtuante;
    private Integer cargaHoraria;
    private Double promocao;


    public Funcionario(String nome, Double salario, String projetoAtuante, Integer cargaHoraria, Double promocao) {
        this.nome = nome;
        this.salario = salario;
        this.projetoAtuante = projetoAtuante;
        this.cargaHoraria = cargaHoraria;
        this.promocao = promocao;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public String getProjetoAtuante() {
        return projetoAtuante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setProjetoAtuante(String projetoAtuante) {
        this.projetoAtuante = projetoAtuante;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public Double getPromocao() {
        return promocao;
    }

    public void setPromocao(Double promocao) {
        this.promocao = promocao;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

        public Double getValorRecebidoHora() {
        return getSalario()/(getCargaHoraria()*22);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", projetoAtuante='" + projetoAtuante + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", promocao=" + promocao +
                '}';
    }
}
