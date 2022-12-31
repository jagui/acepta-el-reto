package v6;

import java.util.Scanner;

public class Uva1CuentaDesdeCero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < num; i++) {
                int year = Integer.parseInt(sc.nextLine());
                System.out.println(year>0?year-1:year);
            }
        }
    }
}
