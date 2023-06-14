package Interface;

public class TiroAoAlvo implements Jogo{
    @Override
    public void jogar() {
        System.out.println("Carregando jogo");
        System.out.println("Voce matou dois passaros");
    }

    @Override
    public void fechar() {
        System.out.println("Salvando progresso");
        System.out.println("O progresso não foi salvo e o jogo fechou");
    }
}
