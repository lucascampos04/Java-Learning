package MetodoGeteSet;

public class Conta {
    private double saldo;

    public void depositar(double valor){
        if (valor < 0){
            System.out.println("Não pode fazer depositos de numeros negativos");
        } else {
            saldo = saldo + valor;
        }
    }

    public double getSaldo(){
        return  saldo;
    }
}
