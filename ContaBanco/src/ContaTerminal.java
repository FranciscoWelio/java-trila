import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int Numero;
        String Agencia;
        String NomeCliente;
        Double Saldo;
       System.out.println("Olá, bem vindo!\n\n\nQual é o seu nome?");
       NomeCliente = scan.nextLine();
       System.out.println("Em que Agência você deseja criar uma conta?");
       Agencia = scan.next();
       System.out.println("Qual é a sua conta?");
       Numero = scan.nextInt();
       System.out.println("Quanto você deseja depositar inicialmente?");
       Saldo = scan.nextDouble();
       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", NomeCliente, Agencia, Numero, Saldo);
    }
}
