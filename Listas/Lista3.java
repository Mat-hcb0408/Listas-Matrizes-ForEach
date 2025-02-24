package Listas;

import java.util.Arrays;
import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        int sum=0;
        int media=0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Insira o "+(i+1)+"° número:");
            numeros[i]= sc.nextInt();
            media=(sum+=numeros[i])/2;
        }

        sc.close();
        System.out.println("A media dos numeros é: "+media);
    }
}