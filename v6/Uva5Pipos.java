package v6;

import java.util.HashMap;
import java.util.Scanner;

public class Uva5Pipos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String year;
            while (!(year = sc.nextLine()).equals("0")) {
                HashMap<Integer, Integer> yearDigits = new HashMap<>();
                for (int i = 0; i < 10; i++) {
                    yearDigits.put(i, 0);
                }

                for (int i = 0; i < 4; i++) {
                    int digit = Integer.parseInt(year.substring(i, i + 1));
                    yearDigits.put(digit, yearDigits.get(digit) + 3);
                }

                String[] piposStr = sc.nextLine().split(" ");
                int[] pipos = new int[10];

                for (int i = 0; i < piposStr.length; i++) {
                    pipos[i] = Integer.parseInt(piposStr[i]);
                }
                int num = Integer.MAX_VALUE;
                for (int digit : yearDigits.keySet()) {
                    int required = yearDigits.get(digit);
                    if (required > 0) {
                        int available = pipos[digit] / required;
                        if (available < num)
                            num = available;
                    }
                }
                System.out.println(num);
            }
        }
    }
}
