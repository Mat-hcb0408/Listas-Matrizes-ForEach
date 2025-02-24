package ForEach;

import java.util.ArrayList;

public class ForEach1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println("Elementos da lista: ");
        for (int numero:nums){
            System.out.println(numero);
        }
    }
}
