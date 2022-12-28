package v1;

import java.util.Scanner;

public class HyperPar {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String line;
      while ((line = sc.nextLine()) != null) {
        if (Integer.parseInt(line) < 0) return;
        boolean isHyperEven = true;
        for (int j = 0; j < line.length(); j++) {
          String digit = line.substring(j, j + 1);
          isHyperEven &= (Integer.parseInt(digit) % 2 == 0);
        }
        System.out.println(isHyperEven ? "SI" : "NO");
      }
    }
  }
}
