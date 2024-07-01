package main;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private float saldo;
    
    public ContaTerminal(int numero, String agencia, String nomeCliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }
}
