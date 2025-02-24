package Matrizes;

import java.util.Scanner;

public class Matriz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("insira o numero de posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Insira um numero escalar:");
        int x = sc.nextInt();
        sc.close();
        int[][] MatrizResult = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MatrizResult[i][j]=matriz[i][j]*x;
            }
        }
        System.out.println("Nova matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(MatrizResult[i][j] + "\t");
            }
            System.out.println();
        }
    }
}