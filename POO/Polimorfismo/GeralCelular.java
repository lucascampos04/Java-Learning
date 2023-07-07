package POO.Polimorfismo;

public abstract class GeralCelular {
    protected String marca;
    protected int versaoDosistemaOperacional;
    protected int memoriaRam;
    protected int memoria;

    public GeralCelular(String marca, int versaoDosistemaOperacional, int memoriaRam, int memoria) {
        this.marca = marca;
        this.versaoDosistemaOperacional = versaoDosistemaOperacional;
        this.memoriaRam = memoriaRam;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVersaoDosistemaOperacional() {
        return versaoDosistemaOperacional;
    }

    public void setVersaoDosistemaOperacional(int versaoDosistemaOperacional) {
        this.versaoDosistemaOperacional = versaoDosistemaOperacional;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public abstract void ligar();
}
