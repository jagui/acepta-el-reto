package v6;

import java.util.Scanner;

public class Uva4Calambur {
    public static void main(String[] args) {
        String abc = "abcdefghijklmnopqrstuwxyz";
        Character[] extra = {'.', ',', ';', ':'};
        try (Scanner sc = new Scanner(System.in)) {
            int num = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < num; i++) {
                String F = sc.nextLine().toUpperCase();
                String first = F.replaceAll("[^A-Z]", "");
                String s = sc.nextLine().toUpperCase();
                String second = s.replaceAll("[^A-Z]", "");
                if (first.length() != second.length()) System.out.println("NO");
                else {
                    Boolean match = true;
                    for (int j = 0; j < first.length(); j++) {
                        char firstChar = first.charAt(j);
                        char secondChar = second.charAt(j);
                        if (firstChar != secondChar) {
                            match = false;
                            break;
                        }
                    }
                    System.out.println(match ? "SI" : "NO");
                }
            }
        }
    }
}