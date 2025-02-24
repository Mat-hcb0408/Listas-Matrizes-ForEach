package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> elementos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + "° numero:");
            elementos.add(sc.nextInt());
        }
        sc.close();
        Collections.reverse(elementos);
        System.out.println(elementos);
    }
}
