package Listas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lista4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        int maior= Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int[] numeros = new int[10];
        for (int i = 0; i<10; i++) {
            numeros[i]= random.nextInt(101);
            if (numeros[i]>maior){
                maior=numeros[i];
            }if (numeros[i]<menor){
                menor=numeros[i];
            }
        }
        sc.close();
        System.out.println(Arrays.toString(numeros));
        System.out.println("O maior número é: "+maior+"\nO menor numero é: "+menor);
    }
}