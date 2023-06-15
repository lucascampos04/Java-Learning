package MetodoConstrutor;

import javax.swing.*;

public class Personagem {
    private String nome;
    private int nivel;
    private int vida;
    private int forca;
    private String classe;

    // método construtor
    public Personagem(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 10;
        if (classe.equals("Estudante")){
            forca = nivel * 2;
        } else {
            forca = nivel;
        }
    }

    public void mostrarStatus(){
        String status = String.format("Nome: %s\nNivel: %d\nVida: %d\nClasse: %s\nForça: %d", nome, nivel, vida, classe, forca);
        JOptionPane.showMessageDialog(null, status);
    }
}

