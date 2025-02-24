package Listas;

import java.util.Arrays;
import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int sum=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o "+(i+1)+"° número:");
            numeros[i]= sc.nextInt();
            sum+=numeros[i];
        }

        sc.close();
        System.out.println("A soma dos numeros é: "+sum);
    }
}