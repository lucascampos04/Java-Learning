package POO.Polimorfismo;

public class Motorola extends GeralCelular{
    public Motorola(String marca, int versaoDosistemaOperacional, int memoriaRam, int memoria) {
        super(marca, versaoDosistemaOperacional, memoriaRam, memoria);
    }

    @Override
    public void ligar() {
        System.out.println("Motorola Ligou");
    }
}
