package POO.Encapsulamento;
import POO.Encapsulamento.PessoaObjeto.Pessoa;
public class app {
    public static void main(String[] args) {
        Pessoa Lucas = new Pessoa("Lucas Oliviera", "Campos", 20);
        Pessoa lucas1 = new Pessoa("Lucas", "Oliveira Campos", 19);

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
