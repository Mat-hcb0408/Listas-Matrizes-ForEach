package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums =new ArrayList<>(10);
        for (int i=0;i<10;i++){
            System.out.println("Insira o "+(i+1)+"° numero:");
            nums.add(sc.nextInt());
        }
        sc.close();
        nums.removeIf(num->num%2!=0);
        System.out.println(nums);
    }
}