package v1;

import java.util.Scanner;

public class HolaMundo {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        System.out.println("Hola mundo.");
      }
    }
  }
}
