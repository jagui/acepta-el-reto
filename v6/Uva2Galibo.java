package v6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uva2Galibo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = 0;
            while ((num = Integer.parseInt(sc.nextLine())) != 0) {
                if (num <= 100) {
                    int min = 800;
                    ArrayList<String[]> lines = new ArrayList<>();
                    for (int i = 0; i < num; i++) {
                        lines.add(sc.nextLine().split(" "));
                    }
                    for (int i = num - 1; i >= 0; i--) {
                        int carriles = Integer.parseInt(lines.get(i)[0]);
                        int nexto = 0;
                        boolean passes = false;
                        for (int j = 0; j < carriles; j++) {
                            int height = Integer.parseInt(lines.get(i)[j + 1]);

                            if (height >= min) passes = true;
                            else if (height > nexto) nexto = height;
                        }
                        if (!passes) min = nexto;
                    }
                    System.out.println(min < 800 ? min : 800);
                }
            }
        }
    }
}
