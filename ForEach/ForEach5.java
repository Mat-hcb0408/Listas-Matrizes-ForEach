package ForEach;

import java.util.ArrayList;

public class ForEach5 {
    public static void main(String[] args) {
        ArrayList<String> nomes =new ArrayList<>();
        nomes.add("Batman");
        nomes.add("Superman");
        nomes.add("Mulher Maravilha");
        nomes.add("Flash");
        nomes.add("Lanterna Verde");
        nomes.add("Caçador de Marte");
        nomes.add("Mulher Gavião");

        for(String nome:nomes){
            System.out.println("Olá, "+nome+"!");
        }
    }
}
