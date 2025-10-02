package br.senai.sp.jandira.ds1t.Jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    int escolhaJogador;
    int escolhaComputador;
    String resultado;
    String jogarNovamente;

    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Esolha uma opção: ");
        escolhaJogador = scanner.nextInt();

        randomizarEscolhaDoComputador();
    }

    public void randomizarEscolhaDoComputador(){
        Random random = new Random();
        escolhaComputador = random.nextInt(3) + 1;
        System.out.println(escolhaComputador);
//        1 -pedra, 2-Papel, 3- Tesoura
        a();
    }

    public void a(){
        if (escolhaJogador == escolhaComputador){
            resultado = "VOCÊ EMPATOU";
        } else if (escolhaJogador == 1 && escolhaComputador == 2) {
            resultado = "VOCÊ PERDEU";
        } else if (escolhaJogador == 1 && escolhaComputador == 3) {
            resultado = "VOCÊ GANHOU";
        } else if (escolhaJogador == 2 && escolhaComputador == 1) {
            resultado = "VOCÊ GANHOU";
        } else if (escolhaJogador == 2 && escolhaComputador == 3) {
            resultado = "VOCÊ PERDEU";
        } else if (escolhaJogador == 3 && escolhaComputador == 1) {
            resultado = "VOCÊ PERDEU";
        } else if (escolhaJogador == 3 && escolhaComputador == 2) {
            resultado = "VOCÊ GANHOU";
        } else{
            System.out.println("Por favor, escolha uma opção valida");
            receberDados();
        }

        exibirResultado();
    }

    public void exibirResultado(){
        System.out.println(resultado);

    }
}
