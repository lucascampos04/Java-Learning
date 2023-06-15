package Logica;

public class funcoes {
    public static void main(String[] args){
        String nome = "Lucas";
        int idade = 18;
        saudacao(nome, idade);

        int resultado = soma(2, 5);
        System.out.println(resultado);

    }

    public static void saudacao(String nome, int idade){
        System.out.println("hello, " + nome + " Voce tem " + idade + " anos ?");
    }

    public static int soma(int a, int b){
        return a + b;
    }
}

