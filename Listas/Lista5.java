package Listas;

import java.util.Scanner;

public class Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + "° número:");
            lista[i] = sc.nextInt();
        }
        System.out.println("Insira um nuemro: ");
        int num = sc.nextInt();

        sc.close();

        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (lista[i] == num) {
                encontrado = true;
                break;
            }
        }
            if (encontrado) {
                System.out.println(num + " está presente na lista.");
            } else {
                System.out.println(num + " não está presente na lista.");
            }
        }
    }