package aulas;

public class Boleanos {
    public static void main(String[] args){
        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosApraia = fimDeSemana && fazendoSol;

        System.out.println(vamosApraia);

        String mensgaem = fimDeSemana ? "Vamos a praia" : "Não é fim de semana";
        System.out.println(mensgaem);
    }
}
