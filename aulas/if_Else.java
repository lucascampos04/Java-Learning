package aulas;

public class if_Else{
    public static void main(String[] args){
        int nota = 8;

        if (nota >= 8) {
            System.out.println("Aluno aprovado");
        } else if (nota <= 5) {
            System.out.println("Aluno com direito de recuperação");
        } 
        else {
            System.out.println("Aluno reprovado, sem direito a recuperação");
        }
    }    
}
