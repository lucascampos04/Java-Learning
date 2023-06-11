package MetodoGeteSet;

import org.w3c.dom.ls.LSOutput;

public class App {
    // Set - alterar || Get - pegar
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lucas");
        pessoa.setAltura(1.85);
        pessoa.setIdade(18);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getIdade());

        System.out.println("Saldo bancario: ");

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(-100);
        System.out.println(conta.getSaldo());
    }
}
