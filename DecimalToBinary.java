import java.util.Scanner;

public class DecimalToBinary {
    public static void decimalParaBinario(int decimal) {
        int[] binario = new int[32];
        int indice = 0;

        if (decimal == 0) {
            System.out.println("O numero binario é 0 \n");
            return;
        }

        while (decimal > 0) {
            binario[indice] = decimal % 2;
            decimal = decimal / 2;
            indice++;
        }

        System.out.println("O numero em binario é : ");
        for (int i = indice - 1; i >= 0; i--) {
            System.out.print(binario[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um numero: ");
            int resultado = input.nextInt();
            decimalParaBinario(resultado);
        }
    }
}
