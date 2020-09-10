package br.com.bandtec.springconsultoria;

public class Holerite {

    public static void main(String[] args) {

        Consultor c1 = new Consultor("Tarcisio", 7000.0, "Duratex", 8,200.0,"Analista BW");

        System.out.println(c1);

        System.out.printf("Valor hora = %.2f %n", (c1.getValorRecebidoHora()));

        GestorProjeto gp1 = new GestorProjeto("sandra", 8500.0, "todos", 8, 1700.0, 600.00);

        System.out.println(gp1);

        System.out.printf("Valor hora = %.2f %n", (gp1.getValorRecebidoHora()));

        }



}
