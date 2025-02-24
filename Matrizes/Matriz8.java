package Matrizes;

import java.util.Random;

public class Matriz8 {
    public static void main(String[] args) {
        Random random=new Random();
        double media=0;
        int sum=0;
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
                sum+=matriz[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        media= (double) sum /16;
        System.out.println("A media dos elementos da matriz é "+media);
    }
}