package POO.Heranca;

public class Passsaro extends Animal {
    static int numeroDoPassaro;

    public Passsaro(String nome, String cor, int idade, String estadoDeEspirito) {
        super(nome, cor, idade, estadoDeEspirito);
    }

    public String toString(){
        return "Passaro{" +
                "Nome=" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }
}
