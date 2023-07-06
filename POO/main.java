package POO;
import POO.CachorroOBjeto.Cachorro;
public class main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.nome = "Lucas";
        dog.idade = 19;
        dog.cor = "Branco";
        dog.peso = 5.5;

        // Metodos
        dog.latir();
        System.out.println("O cachorro pegou uma " + dog.pegarBolinha());

        System.out.println(dog.interagir("banho"));
    }
}
