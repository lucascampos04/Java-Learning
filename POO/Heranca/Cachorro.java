package POO.Heranca;

public class Cachorro extends Animal {
    static int numeroDecachorro;

    public Cachorro(String nome, String cor, int idade, String estadoDeEspirito) {
        super(nome, cor, idade, estadoDeEspirito);
    }

    public String toString(){
        return "Cachorro{" +
                "nome=" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Au au");
    }
}
