import java.util.Scanner;

public class SistemaDePagamentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o valor do salario: ");
            double salarioBase = scanner.nextDouble();

            System.out.print("Digite o valor do bônus: ");
            double bonus = scanner.nextDouble();

            double salarioTotal = calcularSalarioTotal(salarioBase, bonus);
            System.out.println("Salário total: " + salarioTotal);
        } catch (IllegalArgumentException e) {
            System.out.println(("Erro: " + e.getMessage()));
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite um número.");
        } finally {
            scanner.close();
            System.out.println("Programa encerrado.");
        }
    }

    public static double calcularSalarioTotal(double salarioBase, double bonus) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("Salário base não pode ser negativo.");
        }
        if (bonus < 0) {
            throw new IllegalArgumentException("Bônus não pode ser negativo.");
        }
        if (bonus > salarioBase * 0.5){
            throw new IllegalArgumentException("Bônus não pode exceder 50% do salário base.");
        }

        return salarioBase + bonus;
    }

}
