package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + "° numero:");
            lista1.add(sc.nextInt());
        }
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + "° numero:");
            lista2.add(sc.nextInt());
        }
        sc.close();
        ArrayList<Integer> lista3 = new ArrayList<>(lista1);
        lista3.addAll(lista2);
        System.out.println(lista3);
    }
}