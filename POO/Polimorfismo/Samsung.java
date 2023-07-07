package POO.Polimorfismo;

public class Samsung extends GeralCelular{
    public Samsung(String marca, int versaoDosistemaOperacional, int memoriaRam, int memoria) {
        super(marca, versaoDosistemaOperacional, memoriaRam, memoria);
    }

    @Override
    public void ligar() {
        System.out.println("Samsung ligou");
    }
}
