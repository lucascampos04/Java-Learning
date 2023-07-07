package POO.Heranca;
public class app {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Dog", "Preto", 10, "Calmo");
        Gato gato = new Gato("Nininha", "Marrom", 2, "Puta");
        Passsaro passsaro = new Passsaro("Mestre aguia", "Branco", 10, "Só na paz");

        cachorro.soar();
        gato.soar();
        passsaro.soar();
    }
}
