package ForEach;

import java.util.Random;

public class ForEach6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        for (int[] i : matriz) {
            for (int elemento : i) {
                System.out.print(elemento+"\t");
            }
            System.out.println();
        }
    }
}