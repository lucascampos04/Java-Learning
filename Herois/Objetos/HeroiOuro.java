package Herois.Objetos;

public  class HeroiOuro extends HeroiBronze{

    private static final int LEVEL = 50;
    public HeroiOuro(String nome, String arma, String poder, int level) {
        super(nome, arma, poder, level);
    }

    @Override
    public void level_min() {
        if (getLevel() >= LEVEL){
            System.out.printf("O seu herois : %s \nSó pode ser upado até o level %d.", getNome(), LEVEL);
        }
    }
}
