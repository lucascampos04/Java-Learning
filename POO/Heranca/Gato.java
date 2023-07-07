package POO.Heranca;

public class Gato extends Animal{
    static int numeroDoGato;

    public Gato(String nome, String cor, int idade, String estadoDeEspirito) {
        super(nome, cor, idade, estadoDeEspirito);
    }

    @Override
    public String toString(){
        return "Gato{" +
                "nome=" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }
}
