package v1;

import java.util.Scanner;

public class FiestaAburrida {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int iterations = Integer.parseInt(sc.nextLine());
      for (int i = 0; i < iterations; i++) {
        String line = sc.nextLine();
        String name = line.split(" ")[1];
        System.out.printf("Hola, %s%n.", name);
      }
    }
  }
}
