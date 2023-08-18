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
    int[] notasObtidas = new int[numeroAtividadesCadastradas];
    int somandoPesos = 0;

    for (int i = 0; i < numeroAtividadesCadastradas; i++) {
      System.out.printf("Digite o nome da atividade %d:\n", i + 1);
      nomeAtividades[i] = sc.nextLine();

      System.out.printf("Digite o peso da atividade %d:\n", i + 1);
      pesoAtividade[i] = sc.nextInt();
      while (pesoAtividade[i] < 1 || pesoAtividade[i] > 100) {
        System.out.println("Erro: Peso inválido! O peso deve ser entre 1 e 100.");
        System.out.printf("Digite novamente o peso da atividade %d:\n", i + 1);
        pesoAtividade[i] = sc.nextInt();
      }
      sc.nextLine();  // Consume the newline

      somandoPesos += pesoAtividade[i];

      System.out.printf("Digite a nota obtida para %s:\n", nomeAtividades[i]);
      notasObtidas[i] = sc.nextInt();
      while (notasObtidas[i] < 0 || notasObtidas[i] > 100) {
        System.out.println("Erro: Nota inválida! A nota deve ser entre 0 e 100.");
        System.out.printf("Digite novamente a nota obtida para %s:\n", nomeAtividades[i]);
        notasObtidas[i] = sc.nextInt();
      }
      sc.nextLine();  // Consume the newline
    }

    if (somandoPesos != 100) {
      System.out.println("Erro: A soma dos pesos não é igual a 100.");
    }

    double mediaPonderada = 0;
    for (int i = 0; i < numeroAtividadesCadastradas; i++) {
      mediaPonderada += ((double) notasObtidas[i] * pesoAtividade[i]) / 100;
    }

    String resultadoFinal = mediaPonderada >= 85
            ? "Parabéns! Você alcançou " + String.format("%.2f", mediaPonderada)
            + "%! E temos o prazer de informar que você obteve aprovação!"
            : "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
            + String.format("%.2f", mediaPonderada)
            + "%, você não atingiu a pontuação mínima necessária para sua aprovação.";

  }
}