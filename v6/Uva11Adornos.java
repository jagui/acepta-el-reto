package v6;

import java.io.IOException;
import java.util.Scanner;

//TODO: no pasa el juez por tiempo
public class Uva11Adornos {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                int disponibles = sc.nextInt();
                int pedidos = sc.nextInt();
                int maxValue = 0;
                int index = -1;
                int[] pesos = new int[pedidos];
                for (int i = 0; i < pedidos; i++) {
                    pesos[i] = sc.nextInt();
                }
                for (int i = 0; i < disponibles - pedidos; i++) {
                    int sum = 0;
                    for (int j = 0; j < pedidos; j++) {
                        sum += pesos[j];
                    }
                    if (sum % 2 == 0 && sum > maxValue) {
                        maxValue = sum;
                        index = i;
                        if (maxValue >= 100 * pedidos)
                            break;
                    }
                    int[] tmp = new int[pedidos];
                    System.arraycopy(pesos, 1, tmp, 0, pedidos - 1);
                    pesos = tmp;
                    pesos[pedidos - 1] = sc.nextInt();
                }
                if (index == -1)
                    System.out.println("SIN ADORNOS");
                else {
                    System.out.println(index + 1);
                }
            }
        }
    }
}