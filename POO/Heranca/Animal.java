package POO.Heranca;

public class Animal {
    protected String nome;
    protected String cor;
    protected int idade;
    protected String estadoDeEspirito;

    public Animal(String nome, String cor, int idade, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected void comer(){}
    protected void dormir(){}
    public void soar(){
        System.out.println("Soar");
    }

}
