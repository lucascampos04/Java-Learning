package Funcionarios;

import Funcionarios.Objetos.Funcionarios;
import Funcionarios.Objetos.Salario;
import Funcionarios.Objetos.Taxas;

import java.util.Scanner;

public class RhFirma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Funcionario: ");
        String nome = scan.nextLine();

        System.out.println("Cargo do funcionario: ");
        String cargo = scan.nextLine();

        System.out.println("Salario do " + nome);
        double salarioInicial = scan.nextDouble();

        Funcionarios funcionarios = new Funcionarios(nome,cargo);
        Salario salario = new Salario(salarioInicial);

        Taxas taxaDeAumento;

        if (cargo.equalsIgnoreCase("Senior")){
            taxaDeAumento = new Taxas(0.10, 0.15, 0.25);
        } else if (cargo.equalsIgnoreCase("Pleno")) {
            taxaDeAumento = new Taxas(0.5, 0.10, 0.15);
        } else {
            taxaDeAumento = new Taxas(0.3, 0.4, 0.5);
        }

        System.out.println("Escolha uma taxa de aumento");
        System.out.println("1. 5%");
        System.out.println("2. 10%");
        System.out.println("3. 15%");
        int opcao = scan.nextInt();

        double taxaSelecionada;

        if (opcao == 1){
            taxaSelecionada = taxaDeAumento.getAumentoCincoPorcento();
        } else if (opcao == 2) {
            taxaSelecionada = taxaDeAumento.getAumentoDezPorcento();
        } else if (opcao == 3) {
            taxaSelecionada = taxaDeAumento.getAumentoQuinzePorcento();
        } else {
            System.out.println("Nenhuma opção encontrada, assim será aplicada a taxa padrão de 3%");
            taxaSelecionada = taxaDeAumento.getTaxaPadrao();
        }

        double newSalario = salarioInicial * taxaSelecionada;

        System.out.println("Novo salario após aumento: " + newSalario);

        scan.close();

    }
}
