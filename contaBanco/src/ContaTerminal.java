import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args)  {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o numero da sua conta Bancaria:");
            int conta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Agora, Digite o numero da sua Agencia Bancaria:");
            String agencia = scanner.nextLine();

            System.out.println("Digite o seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Digite agora o saldo que devera ser retirado da conta:");
            double saldo = scanner.nextDouble();

            System.out.println(" Olá " + nome  + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponivel para saque.");
        }

        
    }
}


