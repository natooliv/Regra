package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int numeroAtividadesCadastradas = sc.nextInt();
    sc.nextLine();

    String[] nomeAtividades = new String[numeroAtividadesCadastradas];
    int[] pesoAtividade = new int[numeroAtividadesCadastradas];
    int somandoPesos = 0;
    for (int i = 0; i < numeroAtividadesCadastradas; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      nomeAtividades[i] = sc.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      pesoAtividade[i] = sc.nextInt();
      sc.nextLine();

      somandoPesos += pesoAtividade[i];
    }
    if (somandoPesos != 100) {
      System.out.println("Erro: A soma dos pesos não é igual a 100.");
      return;
    }
  }
}
