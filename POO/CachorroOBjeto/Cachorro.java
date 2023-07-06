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
        if (acao.equals("carinho")){
            this.estadoDeEspirito = "Feliz";
            return estadoDeEspirito;
        }
        else if(acao.equals("Tomar Banho")){
            this.estadoDeEspirito = "Latir e chorar";
        }
        else if(acao.equals("Comida")){
            this.estadoDeEspirito = "Comer";
        }
        else {
            this.estadoDeEspirito = "Dormindo";
        }

        return estadoDeEspirito;
    }
}
