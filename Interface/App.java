package Interface;

public class App {
    public static void main(String[] args){
        VideoGame lucas = new VideoGame();
        PingPong ping = new PingPong();

        lucas.ligar(new TiroAoAlvo());
    }
}
