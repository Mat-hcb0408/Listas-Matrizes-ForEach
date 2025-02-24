package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>(8);
        for (int i = 0; i < 8; i++) {
            System.out.println("Insira o " + (i + 1) + "° numero:");
            nums.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(nums);
        System.out.println(nums);
    }
}