package Atributos_metodos;
public class ObejetosFestas {
    public int quantidadeCafe = 100;
    public int getQuantidadeSalgado = 30;

    public void entrar(){
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    private void beberCafe(){
        quantidadeCafe--;
        System.out.println("Bebeu 1 xicara de cafe");
    }

    private void comerSalgado(){
        getQuantidadeSalgado--;

    }

}
