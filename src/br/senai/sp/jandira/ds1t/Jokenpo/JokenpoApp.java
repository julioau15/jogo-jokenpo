package br.senai.sp.jandira.ds1t.Jokenpo;

import br.senai.sp.jandira.ds1t.Jokenpo.model.Jokenpo;

public class JokenpoApp {
    public static void main(String[] args) {

        System.out.println("****************************************");
        System.out.println("**************  JOKÊNPO  ***************");
        System.out.println("****************************************\n");
        System.out.println("          >>> ESCOLHA UMA OPÇÃO <<<\n");
        System.out.println("----------------------------------------");
        System.out.println("|  1 - PEDRA                          |");
        System.out.println("|  2 - PAPEL                          |");
        System.out.println("|  3 - TESOURA                        |");
        System.out.println("----------------------------------------");
        System.out.println("****************************************");

        Jokenpo jokenpo = new Jokenpo();
        jokenpo.receberDados();
    }
}
