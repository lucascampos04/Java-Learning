package Interface;

public class PingPong  implements Jogo{


    @Override
    public void jogar() {
        System.out.println("Jogo iniciando");
        System.out.println("MUsica se inicializando");
    }

    @Override
    public void fechar() {
        System.out.println("Tela de fechar o jogo");
        System.out.println("O jogo esta fechando");
        System.out.println("Progresso salvo");
    }
}
