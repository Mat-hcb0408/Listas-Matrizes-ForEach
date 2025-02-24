package ForEach;

import java.util.Random;

public class ForEach8 {
    public static void main(String[] args) {
        int maior=Integer.MIN_VALUE;
        Random random = new Random();
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(20);
            }
        }
        for (int[] i : matriz) {
            for (int elemento : i) {
                System.out.print(elemento+"\t");
                if (elemento>maior){
                    maior=elemento;
                }
            }
            System.out.println();
        }
        System.out.println("Maior elemento:"+maior);
    }
}
