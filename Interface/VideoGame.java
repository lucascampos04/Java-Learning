package Interface;

public class VideoGame {
    private boolean estaLigado;
    private Jogo jogo;
    public void ligar(Jogo jogo){
        System.out.println("Video game esta ligandooooooooo");
        this.estaLigado = true;
    }
    public void jogar(Jogo jogo){
        if (estaLigado == true){
            System.out.println("Voce esta jogando");
            this.jogo = jogo;
            jogo.jogar();
        } else {
            System.out.println("O video game não esta ligado");
        }
    }

    public void fechar(Jogo jogo){
        if (estaLigado == true){
            System.out.println("fechando o jogo ...");
            boolean temJogoOn = jogo != null;
            jogo.fechar();
            jogo = null;
        } else {
            System.out.println("Não tem nenhum jogo on.");
        }
    }
}
