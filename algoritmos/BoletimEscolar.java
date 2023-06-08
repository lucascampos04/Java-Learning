package algoritmos;
import java.util.Scanner;

public class BoletimEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Senha: ");
        int senha = scanner.nextInt();

        if (nome.equals("Lucas") && senha == 123){
            System.out.println("Seja b em-vindo(a), " + nome);

            float[] notas = {9, 10, 10, 7, 9, 8};
            float soma = 0;

            System.out.println("Se a sua média for de 5 a 6 você terá direito a uma prova recuperatória. Abaixo de 5 você estará reprovado");
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Nota " + (i + 1) + ": " + notas[i]);
                soma += notas[i];
            }
            float media = soma / notas.length;
            System.out.println("Sua nota final é: " + media);

            if (media > 6){
                System.out.println("Parabens!!! voce passou direto");
            } else if (media >=5 && media <= 6) {
                System.out.println("Voce ficou de recuperação");
            } else if (media < 5) {
                System.out.println("Voce esta reprovado");
            } else {
                System.out.println("Nenhuma escolhida");
            }
        } else {
            System.out.println("Login ou senha incorreto");
        }
    }
}
