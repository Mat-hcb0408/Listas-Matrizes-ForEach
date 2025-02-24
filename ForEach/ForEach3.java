package ForEach;

import java.util.ArrayList;
import java.util.Scanner;

public class ForEach3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println("Insira um numero: ");
        int x= sc.nextInt();
        sc.close();
        for(int numero:nums){
            System.out.println(numero*x);
        }
    }
}
