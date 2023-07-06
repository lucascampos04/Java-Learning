package POO.Encapsulamento;
import POO.Encapsulamento.PessoaObjeto.Pessoa;
public class app {
    public static void main(String[] args) {
        Pessoa Lucas = new Pessoa("Lucas Oliviera", "Campos", 20);
        System.out.println(Lucas.getNumeroDePessoas());
        Pessoa lucas1 = new Pessoa("Lucas", "Oliveira Campos", 19);
        System.out.println(lucas1.getNumeroDePessoas());
        Pessoa lucas2 = new Pessoa("Fulano", "Fulano", 19);
        System.out.println(lucas2.getNumeroDePessoas());

        // Variaveis com endereços diferente
        System.out.println(Lucas.toString());
        System.out.println(lucas1.toString());
        System.out.println("");

        // Variaveis com o mesmo endereço
        lucas1 = Lucas;
        System.out.println(Lucas.toString());
        System.out.println(lucas1.toString());

        System.out.println("");
        System.out.println("Pessoa 1");
        System.out.println(lucas1.getNome());
        System.out.println(lucas1.getSobrenome());
        System.out.println(lucas1.getIdade());

        System.out.println("");

        System.out.println("Pessoa 2");
        System.out.println(Lucas.getNome());
        System.out.println(Lucas.getSobrenome());
        System.out.println(Lucas.getIdade());
    }
}
