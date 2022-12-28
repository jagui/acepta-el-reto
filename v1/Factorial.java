package v1;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int num = Integer.parseInt(sc.nextLine());
      for (int i = 0; i < num; i++) {
        int n = Integer.parseInt(sc.nextLine());
        int ret = 0;
        if (n == 0) ret = 1; else if (n <= 2) ret = n; else if (n == 3) ret =
          6; else if (n == 4) ret = 4;
        System.out.println(ret);
      }
    }
  }
}
