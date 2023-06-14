package Interface;

public class Xadrez implements Jogo{
    @Override
    public void jogar() {
        System.out.println("Menu");
        System.out.println("Escolhe a cor das suas peças");
    }
    @Override
    public void fechar() {
        System.out.println("Progesso sendo salvo");
        System.out.println("Jogo fechado");
    }
}
