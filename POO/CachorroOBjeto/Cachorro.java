package POO.CachorroOBjeto;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int idade;

    // Metodos
    public void latir(){
        System.out.println("Au au");
    }
    public String pegarBolinha(){
        return "Bolinha";
    }
    public String estadoDeEspirito;

    public String interagir(String acao){
        switch (acao) {
            case "carinho" -> this.estadoDeEspirito = "Feliz";
            case "Tomar Banho" -> this.estadoDeEspirito = "Latir e chorar";
            case "Comida" -> this.estadoDeEspirito = "Comendo";
            default -> this.estadoDeEspirito = "Dormindo";
        }
        return this.estadoDeEspirito;
    }
}
