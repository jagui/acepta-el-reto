package v6;

import java.util.Scanner;

public class Uva6Restanacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int num0 = sc.nextInt();
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (num0 == 0 && num1 == 0 && num2 == 0) return;
                switch (num2 % 6) {
                    case 0:
                        System.out.println( num0);
                        break;
                    case 1:
                        System.out.println( num1);
                        break;
                    case 2:
                        System.out.println(num1 - num0);
                        break;
                    case 3:
                        System.out.println(-num0);
                        break;
                    case 4:
                        System.out.println(-num1);
                        break;
                    case 5:
                        System.out.println(num0 - num1);
                        break;
                    }
            }
        }
    }
}
