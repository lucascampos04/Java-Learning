package Herois.Objetos;

public abstract class Heroi {
    private String nome;
    private String arma;
    private String poder;
    private int level;

    public Heroi(String nome, String arma, String poder, int level) {
        this.nome = nome;
        this.arma = arma;
        this.poder = poder;
        this.level = level;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract void level_min();
}
