package Atributos_metodos;

public class ContaNetflix {
     private String idiomaPreferencial;
     private String resolucaoTela;

    public void entrar(){
        buscarPreferencialDoUsuario();
        identificarresoluacao();
    }

    private void buscarPreferencialDoUsuario(){
        idiomaPreferencial = "PT-BR";
    }

    private void identificarresoluacao(){
        resolucaoTela = "full HD";
    }

    public void assistirFilme(String nomeFIlme){
        System.out.println("Iniciando filme " + nomeFIlme);
        System.out.println("Carregando filme na resolução " + resolucaoTela);
    }

    private void carregandoFilme(){
        if (idiomaPreferencial.equals("PT-BR") || idiomaPreferencial == "EN_US"){
            System.out.println("Carregando audio em " + idiomaPreferencial);
        } else {
            System.out.println("Carregando audio em EN-US");
        }
    }

}
