package ForEach;

import java.util.Random;

public class ForEach9 {
    public static void main(String[] args) {
        int[] somaColuna=new int[4];
        Random random = new Random();
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        for (int[] i : matriz){
            for(int j=0;j<i.length;j++){
                somaColuna[j]+=i[j];
            }
        }

        for (int i = 0; i < somaColuna.length; i++) {
            System.out.println("Soma da coluna["+(i+1)+"]="+somaColuna[i]);
        }

        for (int[] i : matriz) {
            for (int elemento : i) {
                System.out.print(elemento+"\t");
            }
            System.out.println();
        }
    }
}
