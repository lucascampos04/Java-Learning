package aulas;

public class switCh {
    int nota = 100;
    String graduacao;

    if (nota >= 80){
        graduacao = "A";
    } else if (nota < 80 && nota >= 70){
        graduacao "B";
    } else if (nota < 70 && nota >= 60){
        graduacao "C";
    } else if (nota < 60 && nota >= 0){
        graduacao "D";
    } else {
        graduacao = "";
    }


    switch (nota){
        case "A":
        case "B":
            System.out.println("Aluno aprovado");
        case "C":
        case "D":
            System.out.println("Aluno com direito a recuperação");
        default:
            System.out.println("Aluno reprovado");    
    }
}
