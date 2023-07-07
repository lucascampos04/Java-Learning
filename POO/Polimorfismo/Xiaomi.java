package POO.Polimorfismo;

public class Xiaomi extends GeralCelular{
    public Xiaomi(String marca, int versaoDosistemaOperacional, int memoriaRam, int memoria) {
        super(marca, versaoDosistemaOperacional, memoriaRam, memoria);
    }

    @Override
    public void ligar() {
        System.out.println("Xiaomi ligou");
    }
}
