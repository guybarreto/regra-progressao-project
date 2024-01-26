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
    Period period = new Period();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int numberOfActivities = Integer.parseInt(scanner.nextLine());

    for (int i = 1; i <= numberOfActivities; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String name = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      float weight = Float.parseFloat(scanner.nextLine());

      period.registerActivity(name, weight);
    }

    if (!period.checkSumOfWeights()) {
      System.out.println("A soma dos pesos não é igual a 100!");
      scanner.close();
    } else {
      System.out.println("Atividades cadastradas com sucesso!");
      scanner.close();
    }
  }
}