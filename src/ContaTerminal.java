
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String conta;
        String nomeCliente;
        double saldo;

        Scanner entrada = new Scanner(System.in);        
        System.out.println("Bem-Vindo ao Banco Terminal. Para a criação da sua conta, prossiga com os passos abaixo!");
        System.out.println("========================================================================================");
        System.out.println("Digite o número da Agência(4 dígitos): ");
        numero = entrada.nextInt();
        System.out.println("Digite o número da Conta(ex: 123-4): ");
        entrada = new Scanner(System.in);
        conta = entrada.nextLine();
        System.out.println("Digite o nome do Cliente: ");
        entrada = new Scanner(System.in);
        nomeCliente = entrada.nextLine();
        System.out.println("Digite o Saldo de Entrada: ");
        entrada = new Scanner(System.in);
        saldo = entrada.nextDouble();        

        System.out.println("Olá, " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + numero + ", conta " + conta + " e seu saldo R$" + saldo + " está disponível para saque");       
    }   
}
