package v1;

import java.util.Scanner;

public class MejorImposible {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      while ((Integer.parseInt(sc.nextLine())) > 0) {
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if (
          // Solo se puede ir de casilla par a par o de impar a impar
          (x1 + y1) % 2 != (x2 + y2) % 2
        ) {
          System.out.println("IMPOSIBLE");
        }
        // Siendo la misma casilla origen y fin, no hay saltos
        else if (x1 == x2 && y1 == y2) {
          System.out.println("0");
        }
        // Si los dos puntos determinan un cuadrado, solo hay un salto
        else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
          System.out.println("1");
        }
        // En cualquier otro caso, hay dos saltos
        else {
          System.out.println("2");
        }
        sc.nextLine();
      }
    }
  }
}
