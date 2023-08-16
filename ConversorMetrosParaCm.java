import java.util.Scanner;

public class ConversorMetrosParaCm {
    public static void main(String[] args) {
        double centimetros = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de metros para centimetros\n");
        System.out.println("Os metros só podem estar no intervalo de 1 a 9\n");
        System.out.println("----------------------------");
        System.out.print("Metros: ");
        double metros = scanner.nextDouble();

        while(metros < 1 || metros > 9){
            System.out.println("Tente novamente");
            System.out.println("Os metros só podem estar no intervalo de 1 a 9\n");
            System.out.print("Metros: ");
            metros = scanner.nextDouble();
        }

        centimetros = metros * 100;
        System.out.println("Resultado em centimetros: " + centimetros);
    }
}
