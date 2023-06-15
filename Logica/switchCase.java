package Logica;

public class switchCase {
    public static void main(String[] args){
        int notaAluno = 100;
        char graa;

        if (notaAluno >= 80){
            graa = 'A';
        } else if (notaAluno < 80 && notaAluno >= 70){
            graa = 'B';
        } else if (notaAluno < 70 && notaAluno >= 60){
            graa = 'C';
        } else if (notaAluno < 60 && notaAluno >= 0){
            graa = 'D';
        } else {
            graa = ' ';
        }

        switch (graa){
            case 'A':
            case 'B':
                System.out.println("Aluno aprovado");
                break;
            case 'C':
            case 'D':
                System.out.println("Aluno com direito a recuperação");
                break;
            default:
                System.out.println("Aluno reprovado");
                break;
        }
    }
}
