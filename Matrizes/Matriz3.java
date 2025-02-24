package Matrizes;

import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior= Integer.MIN_VALUE;
        int[][] numeros=new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println("insira o numero de posição ["+i+"]["+j+"]: ");
                numeros[i][j]= sc.nextInt();
                if (numeros[i][j]>maior){
                    maior=numeros[i][j];
                }
            }
        }
        sc.close();
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(numeros[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("O maior elemento dessa matriz é: "+maior);

    }
}
