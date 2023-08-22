package Herois.Objetos;

public  class HeroiMaster extends HeroiBronze{
    private static final int LEVEL = 100;
    public HeroiMaster(String nome, String arma, String poder, int level) {
        super(nome, arma, poder, level);
    }
    @Override
    public void level_min() {
        if (getLevel() >= LEVEL){
            System.out.printf("O seu herois : %s \nSó pode ser upado até o level %d.", getNome(), LEVEL);
        }
    }
}
