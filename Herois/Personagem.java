package Herois;

import Herois.Objetos.Heroi;
import Herois.Objetos.HeroiBronze;

import java.util.Scanner;

public class Personagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Crie seu personagem: ");

        System.out.println("Nome: ");
        String nome = scan.nextLine();

        System.out.println("Arma: ");
        String arma = scan.nextLine();

        System.out.println("Poder: ");
        String poder = scan.nextLine();

        System.out.println("Level: ");
        int level = scan.nextInt();

        HeroiBronze heroi = new HeroiBronze(nome,arma,poder,level);

        heroi.level_min();

    }
}
