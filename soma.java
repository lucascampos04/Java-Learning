import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro Numero: ");
        double n1 = scanner.nextDouble();
        System.out.println("Segundo NUmero: ");
        double n2 = scanner.nextDouble();

        double soma = n1 + n2;
        System.out.println("O resultado da soma é : " + soma);
    }
}
