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

    public void iniciarJogo(){
        System.out.println("----------------------------------------");
        System.out.println("**************  JOKÊNPO  ***************");
        System.out.println("----------------------------------------\n");
        System.out.println("       >>> ESCOLHA UMA OPÇÃO <<<\n");
        System.out.println("----------------------------------------");
        System.out.println("|             (1) - PEDRA              |");
        System.out.println("|             (2) - PAPEL              |");
        System.out.println("|             (3) - TESOURA            |");
        System.out.println("----------------------------------------");

        receberDados();
    }

    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha uma opção: ");
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
            resultado = "***** VOCÊ EMPATOU *****";
        } else if (escolhaJogador == 1 && escolhaComputador == 2) {
            resultado = "***** VOCÊ PERDEU *****";
        } else if (escolhaJogador == 1 && escolhaComputador == 3) {
            resultado = "***** VOCÊ GANHOU *****";
        } else if (escolhaJogador == 2 && escolhaComputador == 1) {
            resultado = "***** VOCÊ GANHOU *****";
        } else if (escolhaJogador == 2 && escolhaComputador == 3) {
            resultado = "***** VOCÊ PERDEU *****";
        } else if (escolhaJogador == 3 && escolhaComputador == 1) {
            resultado = "***** VOCÊ PERDEU *****";
        } else if (escolhaJogador == 3 && escolhaComputador == 2) {
            resultado = "***** VOCÊ GANHOU *****";
        } else{
            System.out.println("Por favor, escolha uma opção valida");
            receberDados();
        }

        definirNomeDaEScolha();
    }

    public void definirNomeDaEScolha(){
        if (escolhaJogador == 1){
            nomeEscolhaJogador = "Pedra";
        } else if (escolhaJogador == 2){
            nomeEscolhaJogador = "Papel";
        } else if (escolhaJogador == 3) {
            nomeEscolhaJogador = "Tesoura";
        }

        if (escolhaComputador == 1){
            nomeEscolhaComputador = "Pedra";
        } else if (escolhaComputador == 2){
            nomeEscolhaComputador = "Papel";
        } else if (escolhaComputador == 3) {
            nomeEscolhaComputador = "Tesoura";
        }

        exibirResultado();
    }

    public void exibirResultado(){
        System.out.println("----------------------------------------\n");
        System.out.println("        Você escolheu: " + nomeEscolhaJogador + "\n");
        System.out.println("        O Computador escolheu: " + nomeEscolhaComputador + "\n");
        System.out.println("        " + resultado + "\n");
        System.out.println("----------------------------------------\n");


        reiniciarJogo();
    }

    public void reiniciarJogo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogar novamente (S/N)? ");
        jogarNovamente = scanner.nextLine();

        if (jogarNovamente.equals("s") || jogarNovamente.equals("S")){
            iniciarJogo();
        } else if (jogarNovamente.equals("n") || jogarNovamente.equals("N")){
            System.out.println("Obrigado por jogar!");
        }else{
            System.out.println("Por favor, escolha uma opção valida");
            reiniciarJogo();
        }
        }
    }

