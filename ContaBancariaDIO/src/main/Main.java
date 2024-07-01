package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agencia: ");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = sc.next();

        ContaTerminal conta1 = new ContaTerminal(numero, agencia, nomeCliente);

        System.out.println("Olá " + conta1.getNomeCliente()
                + ", obrigado por criar uma conta em nosso banco, sua agencia é " + conta1.getAgencia() + ", conta "
                + conta1.getNumero() + " e seu saldo " + conta1.getSaldo() + " já está disponível para saque.");
    }
}
