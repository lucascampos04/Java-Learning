package POO;

import java.util.Random;

public class Herois {
    String nome;
    int forca;

    int gerarDano(){
        Random danoAleatorio = new Random();
        int danoAle= 1 + danoAleatorio.nextInt(20);
        int dano =forca + danoAle;
        return  dano;
    }

    void status(String habilidade, String vilao){
        int danoCausado = gerarDano();
        if (habilidade.length() == 0) {
            System.out.format("O %s usou a/o %s porem nçao acertou o %s", nome, habilidade, vilao);
        } else {
            System.out.format("O %s usou a/0 %s e tirou %d de dano do %s \n", nome, habilidade, danoCausado, vilao);
        }
    }
}
