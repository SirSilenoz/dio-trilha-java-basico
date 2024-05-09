import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        System.out.println("Digite seu nome: ");
        NomeCliente = sc.next();
        System.out.println("Digite o número da Agência");
        Agencia = sc.next();
        System.out.println("Digite o número da Conta");
        Numero = sc.nextInt();
        System.out.println("Digite o saldo:");
        Saldo = sc.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");


    }
}



