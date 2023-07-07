package POO.Polimorfismo;

public class Iphone extends GeralCelular{

    public Iphone(String marca, int versaoDosistemaOperacional, int memoriaRam, int memoria) {
        super(marca, versaoDosistemaOperacional, memoriaRam, memoria);
    }

    @Override
    public void ligar() {
        System.out.println("Iphone Ligou");
    }
}
