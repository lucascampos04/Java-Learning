package POO;

public class pooHerois {
    public static void main(String[] args){
        Herois thor = new Herois();
        Herois hulk = new Herois();

        thor.nome = "Thor";
        hulk.nome = "Hulk";

        thor.status("martelo", "loki");
        hulk.status("punhos", "loki");
    }
}
