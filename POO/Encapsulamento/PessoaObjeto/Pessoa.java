package POO.Encapsulamento.PessoaObjeto;
import POO.Encapsulamento.app;

public class Pessoa {
    // Atributos
    private String nome;
    private String sobrenome;
    private Float idade;
    static int NumeroDePessoas;

    // Construtores

    public Pessoa(String nome, String sobrenome, float idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;

        NumeroDePessoas ++;
    }

    // Metodos


    public static int getNumeroDePessoas() {
        return NumeroDePessoas;
    }

    public static void setNumeroDePessoas(int numeroDePessoas) {
        NumeroDePessoas = numeroDePessoas;
    }

    // O get pega
    public String getNome(){
        if (nome.equals("Luc")){
            return "Não responder";
        }
        return this.nome;
    }

    // O set coloca
    public void setNome(String nome){
        this.nome = nome;
    }



    // O get pega
    public String getSobrenome() {
        return sobrenome;
    }

    // O set coloca
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }



    // O get pega
    public Float getIdade() {
        return idade;
    }

    // O set coloca
    public void setIdade(Float idade) {
        this.idade = idade;
    }

    // ToString
    //@Override
    //public String toString() {
    //    return "Pessoa{" +
    //            "nome='" + nome + '\'' +
    //            '}';
    //}
}


