package MetodoCOnstrutor;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa (String nome, int idade, float altura){
        System.out.println("uma pessoa acaba de nascer");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void imprimirDados(){
        System.out.format("Nome: %s, idade: %d, altura: %.2f \n", nome, idade, altura);
    }
}
