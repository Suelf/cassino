package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<apostas> budega = new ArrayList<apostas>();
    public static ArrayList<jogador> banco = new ArrayList<jogador>();

    public static void main(String[] args) {
        while (true){
            Main();
            Scanner scanner = new Scanner(System.in);
            int ler = scanner.nextInt();
            switch (ler){
                case 1:
                    Apostas();
                    break;
                case 2 :
                    //Verjoga();
                    break;
                case 3:
                    QtdApost();
                    break;
                 default:
                     System.err.println("| ERRO | Nenhuma opção encontrada. ");
                     break;
            }
        }

    }
    private static void Main(){
        System.out.println("            CASSINO");
        System.out.println();
        System.out.println(" 1 - Iniciar apostas");
        System.out.println("2 -  ver jogadores");
        System.out.println("3 - Quantidades de apostas feitas");
        System.out.println("escolha uma opção: ");
    }

    private static void Apostas(){
        System.out.println("Informe o nome do jogador: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        System.out.println("Informe seu numero da sorte: ");
        int n = scanner.nextInt();
        System.out.println("Informe o valor da aposta: ");
        int a = scanner.nextInt();
        apostas Valor = new apostas();
        Valor.setValorA(a + Valor.getValorA() );
        apostas Apostas = new apostas();
        Apostas.setQtdApostas(Apostas.getQtdApostas() + 1);

        Random sorteio = new Random();
        int sorteado = sorteio.nextInt(1);
        if (sorteado == n ) {
            System.out.println("Parabéns você ganhou !!");
            System.out.println("Numero sorteado " + n);
            System.out.println("Seu valor apostado " + a);
            apostas novoV = new apostas();
            novoV.SetValorDj(a * 2);
            System.out.println("Seu novo valor "+ novoV.getValorDj());
            System.out.println();
            System.out.println();
            System.out.println();
        }
        else {
            System.out.println("Que pena, você perdeu! Tente denovo.");
            System.out.println("Numero sorteado "+ sorteado);
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
    private static void QtdApost(){

        System.out.println("         QUANTIDADES DE APOSTAS FEITAS  ");
        apostas Apostas = new apostas();
        System.out.println(Apostas.getQtdApostas());

    }

   /* private static void Verjoga(){
        for (int i=0; banco.size(); i++){
        System.out.println(banco.get(i));
        }
    }*/

}
