package v1;

import java.text.ParseException;
import java.util.Scanner;

public class DiasFaltan {

  public static void main(String[] args) throws ParseException {
    int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    try (Scanner sc = new Scanner(System.in)) {
      int num = Integer.parseInt(sc.nextLine());
      for (int i = 0; i < num; i++) {
        String[] nums = sc.nextLine().split(" ");
        int month = Integer.parseInt(nums[1]);
        int day = Integer.parseInt(nums[0]);
        int days = daysInMonth[month - 1] - day;
        for (int j = month; j < daysInMonth.length; j++) {
          days += daysInMonth[j];
        }
        System.out.println(days);
      }
    }
  }
}
