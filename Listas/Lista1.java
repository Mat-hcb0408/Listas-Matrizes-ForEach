package Listas;

import java.util.Arrays;
import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o "+(i+1)+"° número:");
            numeros[i]= sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(numeros));
    }
}