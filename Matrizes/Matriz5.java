package Matrizes;

import java.util.Scanner;

public class Matriz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[][] numeros=new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println("insira o numero de posição ["+i+"]["+j+"]: ");
                numeros[i][j]= sc.nextInt();
            }
        }
        sc.close();
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(numeros[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
           sum+=numeros[i][2-i];
        }
        System.out.println("soma da diagonal secundaria: "+sum);
    }
}