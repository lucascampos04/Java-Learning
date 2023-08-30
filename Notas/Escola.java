package Notas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> notasAlunos = new ArrayList<>();
        double soma = 0;
        double media = 0;

        for(int i = 0; i < 1; i++){
            System.out.println("Aluno " + (i + 1) + " : ");
            String nomeAluno = scan.nextLine();
            nomes.add(nomeAluno);
        }

        for (String nome : nomes){
            System.out.println(nome);
        }

        for (int i = 0; i < 3; i++){
            System.out.println("Nota " + (i + 1) + " : ");
            double notasAluno = scan.nextDouble();
            notasAlunos.add(notasAluno);
        }

        for (Double nota : notasAlunos){
            soma += nota;
            media = soma / 4;

            if (media > 8){
                System.out.println("APROVADO");
                return;
            }
            System.out.println("REPROVADO");
        }
        System.out.println("Sua media : " + media);
        System.out.println("Media para ser aprovado : 8");

        System.out.println("Preciose qualquer tecla para fechar o programa");
        int carachter = System.in.read();


    }
}
