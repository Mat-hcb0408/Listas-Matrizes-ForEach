package Matrizes;

import java.util.Scanner;

public class Matriz10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] somaLinhas = new int[3];
        int[] somaColunas = new int[3];
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("insira o numero de posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Soma da linha " +i+"="+somaLinhas[i]);
        }
        for (int j = 0; j < 3; j++){
            System.out.println("Soma da coluna " +j+"="+somaColunas[j]);
        }
    }
}