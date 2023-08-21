import java.util.Scanner;

public class SystemParking {
    public static void main(String[] args) {
        int totalAndares = 3;
        int vagasPorAndar = 10;
        boolean[][] vagas = new boolean[totalAndares][vagasPorAndar];
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Escolha o andar (1 a 3, ou 0 para sair): ");
            int andarEscolhido = scan.nextInt();

            if (andarEscolhido == 0){
                System.out.println("Saindo do programa...");
                break;
            }

            if (andarEscolhido < 1 || andarEscolhido > totalAndares){
                System.out.println("Andar inválido. Escolha um andar de 1 a 3.");
                continue;
            }

            System.out.println("Escolha uma vaga de 1 a 10");
            int vagaEscolhida = scan.nextInt();

            if (vagaEscolhida < 1 || vagaEscolhida > vagasPorAndar){
                System.out.println("Vaga invalida. Escolha uma vaga de 1 a 10");
                continue;
            }

            // Verifique se a vaga está ocupada

            if (vagas[andarEscolhido - 1][vagaEscolhida - 1]){
                System.out.println("A vaga escolhida está ocupada.");
            } else {
                vagas[andarEscolhido - 1][vagaEscolhida - 1] = true;
                System.out.println("Vaga ocupada com sucesso");
            }
        }

        scan.close();
    }
}
