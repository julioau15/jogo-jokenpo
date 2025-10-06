package br.senai.sp.jandira.ds1t.Jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    int escolhaJogador;
    int escolhaComputador;
    String resultado;
    String jogarNovamente;
    String nomeEscolhaJogador;
    String nomeEscolhaComputador;
    String reset = "\u001B[0m";
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";
    String blue = "\u001B[34m";
    String backgroundGrey = "\033[48;5;236m";
    //\033[48;5;Xm
    public void iniciarJogo(){
        System.out.println(backgroundGrey + "----------------------------------------" + reset);
        System.out.println(backgroundGrey + "**************  JOKÊNPO  ***************" + reset);
        System.out.println(backgroundGrey + "----------------------------------------" + reset);
        System.out.println(backgroundGrey + "       >>> ESCOLHA UMA OPÇÃO <<<        " + reset);
        System.out.println(backgroundGrey + "----------------------------------------" + reset);
        System.out.println(backgroundGrey + "|             (1) - PEDRA              |" + reset);
        System.out.println(backgroundGrey + "|             (2) - PAPEL              |" + reset);
        System.out.println(backgroundGrey + "|             (3) - TESOURA            |" + reset);
        System.out.println(backgroundGrey + "----------------------------------------" + reset);

        receberDados();
    }

    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(blue + "Escolha uma opção: " + reset);
        escolhaJogador = scanner.nextInt();

        randomizarEscolhaDoComputador();
    }

    public void randomizarEscolhaDoComputador(){
        Random random = new Random();

        escolhaComputador = random.nextInt(3) + 1;

        verificarResultado();
    }

    public void verificarResultado(){
        if (escolhaJogador == escolhaComputador){
            resultado = yellow + "***** VOCÊ EMPATOU *****" + reset;
        } else if (escolhaJogador == 1 && escolhaComputador == 2) {
            resultado =red + "***** VOCÊ PERDEU ***** " + reset;
        } else if (escolhaJogador == 1 && escolhaComputador == 3) {
            resultado = green + "***** VOCÊ GANHOU ***** " + reset;
        } else if (escolhaJogador == 2 && escolhaComputador == 1) {
            resultado = green + "***** VOCÊ GANHOU ***** " + reset;
        } else if (escolhaJogador == 2 && escolhaComputador == 3) {
            resultado = red + "***** VOCÊ PERDEU ***** " + reset;
        } else if (escolhaJogador == 3 && escolhaComputador == 1) {
            resultado = red + "***** VOCÊ PERDEU ***** " + reset;
        } else if (escolhaJogador == 3 && escolhaComputador == 2) {
            resultado = green + "***** VOCÊ GANHOU ***** " + reset;
        } else{
            System.out.println( red + "Por favor, escolha uma opção valida" + reset);
            receberDados();
        }

        definirNomeDaEScolha();
    }

    public void definirNomeDaEScolha(){
        if (escolhaJogador == 1){
            nomeEscolhaJogador = "Pedra  ";
        } else if (escolhaJogador == 2){
            nomeEscolhaJogador = "Papel  ";
        } else if (escolhaJogador == 3) {
            nomeEscolhaJogador = "Tesoura";
        }

        if (escolhaComputador == 1){
            nomeEscolhaComputador = "Pedra  ";
        } else if (escolhaComputador == 2){
            nomeEscolhaComputador = "Papel  ";
        } else if (escolhaComputador == 3) {
            nomeEscolhaComputador = "Tesoura";
        }

        exibirResultado();
    }

    public void exibirResultado(){
        System.out.println(backgroundGrey + "----------------------------------------" + reset);
        System.out.println(backgroundGrey + "                                        " + reset);
        System.out.println(backgroundGrey + "        Você escolheu: " + green + nomeEscolhaJogador + "          " + reset);
        System.out.println(backgroundGrey + "        O Computador escolheu: " + green + nomeEscolhaComputador + "  " + reset);
        System.out.println(backgroundGrey + "        " + resultado + backgroundGrey + "        "  + reset);
        System.out.println(backgroundGrey + "                                        " + reset);
        System.out.println(backgroundGrey + "----------------------------------------" + reset);


        reiniciarJogo();
    }

    public void reiniciarJogo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println( blue + "Jogar novamente (S/N)? " + reset);
        jogarNovamente = scanner.nextLine();

        if (jogarNovamente.equals("s") || jogarNovamente.equals("S")){
            iniciarJogo();
        } else if (jogarNovamente.equals("n") || jogarNovamente.equals("N")){
            System.out.println(blue + "------ Obrigado por jogar! ------" + reset);
        }else{
            System.out.println( red + "Por favor, escolha uma opção valida" + reset);
            reiniciarJogo();
        }
    }
}

