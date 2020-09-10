package br.com.bandtec.springconsultoria;

public class Holerite {

    public static void main(String[] args) {

        Consultor c1 = new Consultor("Tarcisio", 10000.0, "Duratex", 8.0,2000.0,"Analista BW");

        System.out.println(c1);

        GestorProjeto gp1 = new GestorProjeto("sandra", 8500.0, "todos", 8.0, 1700.0, 600.00);

        System.out.println(gp1);

        }



}
