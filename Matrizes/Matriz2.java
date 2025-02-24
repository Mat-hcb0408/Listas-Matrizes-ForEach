package Matrizes;

import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[][] numeros=new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println("insira o numero de posição ["+i+"]["+j+"]: ");
                numeros[i][j]= sc.nextInt();
                sum+=numeros[i][j];
            }
        }
        sc.close();
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(numeros[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("A soma dos elementos dessa matriz é: "+sum);
    }
}
