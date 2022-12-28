package v1;

import java.util.Scanner;

public class PerimetroRectangulo {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        String[] nums = sc.nextLine().split(" ");
        int num0 = Integer.parseInt(nums[0]);
        int num1 = Integer.parseInt(nums[1]);
        if (num0 < 0 || num1 < 0) System.exit(0);
        System.out.println((num0 + num1) * 2);
      }
    }
  }
}
