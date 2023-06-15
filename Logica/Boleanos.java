package Logica;

public class Boleanos {
    public static void main(String[] args){
        int nota = 50;

        if (nota >= 70){
            System.out.println("Aluno aprovado");
        }else if (nota >= 50 && nota <= 69) {
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }

    }
}
