import java.util.Scanner;

public class ConversorCmParaM {
    public static void main(String[] args) {
        double metros = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de centimetros para metros\n");
        System.out.println("Os centimetros so podem ser do numero 1 ao 9\n");
        System.out.println("----------------------------");
        System.out.print("Centimetros: ");
        int centimetros = scanner.nextInt();

        while (centimetros < 1 || centimetros > 9) {
            System.out.println("Tente novamente");
            System.out.println("Os centimetros so podem ser do numero 1 ao 9\n");
            System.out.print("Centimetros: ");
            centimetros = scanner.nextInt();
        }

        metros = centimetros * 0.01;
        System.out.println("Resultado: " + metros);

        scanner.close();

    }
}
