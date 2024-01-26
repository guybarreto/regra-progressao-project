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

      System.out.println("Digite a nota obtida para " + name + ":");
      float grade = Float.parseFloat(scanner.nextLine());

      period.registerActivity(name, weight, grade);
    }

    if (!period.checkSumOfWeights()) {
      System.out.println("A soma dos pesos é diferente de 100!");
      scanner.close();
    } else {
      float percentage = period.calculatePercentage();
      System.out.println("Você alcançou " + percentage + "%!");

      if (percentage >= 85.0) {
        System.out.println("Parabéns! Você obteve aprovação!");
      } else {
        System.out.println(
            "Lamentamos informar que você não atingiu a pontuação "
                + "mínima necessária para sua aprovação."
        );
      }
    }
  }
}