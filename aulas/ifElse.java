package aulas;

public class ifElse{
    public static void main(String[] args){
        String nome = "Lucas";
        int idade = 18;
        int i = 0;

        for (i=0; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Seu nome é :" + nome);

        if (idade >= 18){
            System.out.println("Voce é maior de idade");;
        } else {
            System.out.println("Voce é menor de idade");
        }
    }    
}
