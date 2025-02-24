package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + "° nome:");
            nomes.add(sc.nextLine());
        }
        sc.close();
        Collections.sort(nomes);
        System.out.println(nomes);
    }
}