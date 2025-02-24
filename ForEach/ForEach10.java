package ForEach;

import java.util.ArrayList;
import java.util.Random;

public class ForEach10 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(-3);
        nums.add(-2);
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        
        for (int numero:nums){
            if (numero<0){
                numero=0;
            }
            System.out.println(numero);
    }
}
}