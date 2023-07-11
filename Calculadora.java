import java.util.Scanner;

public class Calculadora {
    public double soma(double[] numeros) {
        double resultado = 0.0;

        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public double subtracao(double[] numeros) {
        double resultado = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public double multiplicacao(double[] numeros) {
        double resultado = 1.0;

        for (double numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

    public double divisao(double[] numeros) {
        double resultado = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            resultado /= numeros[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOpcaoValida = false;

        while (!isOpcaoValida) {
            System.out.println("[1] - Soma | [2] - Subtração | [3] - Multiplicação | [4] - Divisão");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantos números deseja somar? ");
                    int quantidadeNumerosSoma = input.nextInt();

                    double[] numeros = new double[quantidadeNumerosSoma];

                    for (int i = 0; i < quantidadeNumerosSoma; i++) {
                        System.out.print("Digite o número " + (i + 1) + ": ");
                        numeros[i] = input.nextDouble();
                    }

                    Calculadora calculadora = new Calculadora();
                    double resultado = calculadora.soma(numeros);

                    System.out.println("Resultado da soma: " + resultado);
                    isOpcaoValida = true;
                    break;

                case 2:
                    System.out.print("Quantos números deseja subtrair? ");
                    int quantidadeNumerosSub = input.nextInt();

                    double[] numerosSub = new double[quantidadeNumerosSub];

                    for (int i = 0; i < quantidadeNumerosSub; i++) {
                        System.out.print("Digite o número " + (i + 1) + ": ");
                        numerosSub[i] = input.nextDouble();
                    }

                    Calculadora calculadora1 = new Calculadora();
                    double resultado1 = calculadora1.subtracao(numerosSub);

                    System.out.println("Resultado da subtração: " + resultado1);
                    isOpcaoValida = true;
                    break;

                case 3:
                    System.out.print("Quantos números deseja multiplicar? ");
                    int quantidadeNumerosMulti = input.nextInt();

                    double[] numerosMulti = new double[quantidadeNumerosMulti];

                    for (int i = 0; i < quantidadeNumerosMulti; i++) {
                        System.out.print("Digite o número " + (i + 1) + ": ");
                        numerosMulti[i] = input.nextDouble();
                    }

                    Calculadora calculadora2 = new Calculadora();
                    double resultado2 = calculadora2.multiplicacao(numerosMulti);

                    System.out.println("Resultado da multiplicação: " + resultado2);
                    isOpcaoValida = true;
                    break;

                case 4:
                    System.out.print("Quantos números deseja dividir? ");
                    int quantidadeNumerosDiv = input.nextInt();

                    double[] numerosDiv = new double[quantidadeNumerosDiv];

                    for (int i = 0; i < quantidadeNumerosDiv; i++) {
                        System.out.print("Digite o número " + (i + 1) + ": ");
                        numerosDiv[i] = input.nextDouble();
                    }

                    Calculadora calculadora3 = new Calculadora();
                    double resultado3 = calculadora3.divisao(numerosDiv);

                    System.out.println("Resultado da divisão: " + resultado3);
                    isOpcaoValida = true;
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}
