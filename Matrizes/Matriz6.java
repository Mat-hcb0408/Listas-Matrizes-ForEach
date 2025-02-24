package Matrizes;

import java.util.Scanner;

public class Matriz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um numero:");
        int x= sc.nextInt();
        int[][] matriz=new int[x][x];
        for (int i=0;i<x;i++){
            for (int j=0;j<x;j++){
                if (i==j){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        sc.close();
        System.out.println("Matriz identidade: ");
        for (int i=0;i<x;i++){
            for (int j=0;j<x;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        }
    }
