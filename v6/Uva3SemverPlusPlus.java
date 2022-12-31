package v6;

import java.util.Scanner;

public class Uva3SemverPlusPlus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < num; i++) {
                String[] vers = sc.nextLine().split(" ");
                String[] vers1 = vers[0].split("\\.");
                int major1 = Integer.parseInt(vers1[0]);
                int minor1 = Integer.parseInt(vers1[1]);
                int patch1 = Integer.parseInt(vers1[2]);
                String[] vers2 = vers[1].split("\\.");
                int major2 = Integer.parseInt(vers2[0]);
                int minor2 = Integer.parseInt(vers2[1]);
                int patch2 = Integer.parseInt(vers2[2]);
                boolean can =
                        (major2 == major1 + 1 && minor2 == 0 && patch2 == 0) ||
                                (major2 == major1 && minor2 == minor1 + 1 && patch2 == 0) ||
                                (major2 == major1 && minor2 == minor1 && patch2 == patch1 + 1);
                System.out.println(can ? "SI" : "NO");
            }
        }
    }
}
