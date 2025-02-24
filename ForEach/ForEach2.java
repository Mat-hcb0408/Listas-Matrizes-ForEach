package ForEach;

import java.util.ArrayList;

public class ForEach2 {
    public static void main(String[] args) {
        int sum=0;
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        for(int numero:nums){
            sum+=numero;
        }
        System.out.println("A soma dos elementos da lista é: "+sum);
    }
}
