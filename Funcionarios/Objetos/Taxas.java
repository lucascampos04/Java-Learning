package Funcionarios.Objetos;

public class Taxas {
    double taxaUm;
    double taxaDois;
    double taxaTres;

    double aumentoCincoPorcento = 0.5;
    double aumentoDezPorcento = 0.10;
    double aumentoQuinzePorcento = 0.15;
    double taxaPadrao = 0.3;

    public Taxas(double taxaUm, double taxaDois, double taxaTres) {
        this.taxaUm = taxaUm;
        this.taxaDois = taxaDois;
        this.taxaTres = taxaTres;
    }

    public void TaxasSelecionadas(double aumentoCincoPorcento, double aumentoDezPorcento, double aumentoQuinzePorcento, double taxaPadrao){
        this.aumentoCincoPorcento = aumentoCincoPorcento;
        this.aumentoDezPorcento = aumentoDezPorcento;
        this.aumentoQuinzePorcento = aumentoQuinzePorcento;
        this.taxaPadrao = taxaPadrao;
    }

    public double getTaxaUm() {
        return taxaUm;
    }

    public void setTaxaUm(double taxaUm) {
        this.taxaUm = taxaUm;
    }

    public double getTaxaDois() {
        return taxaDois;
    }

    public void setTaxaDois(double taxaDois) {
        this.taxaDois = taxaDois;
    }

    public double getTaxaTres() {
        return taxaTres;
    }

    public void setTaxaTres(double taxaTres) {
        this.taxaTres = taxaTres;
    }

    public double getAumentoCincoPorcento() {
        return aumentoCincoPorcento;
    }

    public void setAumentoCincoPorcento(double aumentoCincoPorcento) {
        this.aumentoCincoPorcento = aumentoCincoPorcento;
    }

    public double getAumentoDezPorcento() {
        return aumentoDezPorcento;
    }

    public void setAumentoDezPorcento(double aumentoDezPorcento) {
        this.aumentoDezPorcento = aumentoDezPorcento;
    }

    public double getAumentoQuinzePorcento() {
        return aumentoQuinzePorcento;
    }

    public void setAumentoQuinzePorcento(double aumentoQuinzePorcento) {
        this.aumentoQuinzePorcento = aumentoQuinzePorcento;
    }

    public double getTaxaPadrao() {
        return taxaPadrao;
    }

    public void setTaxaPadrao(double taxaPadrao) {
        this.taxaPadrao = taxaPadrao;
    }
}
