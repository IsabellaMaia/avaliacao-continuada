package br.com.bandtec.springconsultoria;

public class GestorProjeto extends Funcionario {

    private Double pagamentoHoraAdicional;


    public GestorProjeto(String nome, Double salario, String projetoAtuante, Integer cargaHoraria,
                         Double promocao, Double pagamentoHora) {
        super(nome, salario, projetoAtuante, cargaHoraria, promocao);
        this.pagamentoHoraAdicional = pagamentoHora;
    }


    public Double getPagamentoHora() {
        return pagamentoHoraAdicional;
    }

    public void setPagamentoHora(Double pagamentoHora) {
        this.pagamentoHoraAdicional = pagamentoHora;
    }

    public Double getSalarioGP(){
        return getSalario() + getPagamentoHora() +getPromocao();
    }

    @Override
    public String toString() {
        return "GestorProjeto{" +
                "Pagamento por Hora Adicional=" + pagamentoHoraAdicional +
                "salarioGestor=" +getSalarioGP()+
                "} " + super.toString();
    }
}
