package algoritmos;

import java.util.ArrayList;
import java.util.Scanner;

public class caixa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {};

        System.out.println("Coloque seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Senha: ");
        int senha = scanner.nextInt();



        if (nome.equals("lucas") && senha == 123){
            System.out.println("Login feito com sucesso!!" + nome);
        } else {
            System.out.println("Senha iou usuario incorreto!!");
        }










    }
}
