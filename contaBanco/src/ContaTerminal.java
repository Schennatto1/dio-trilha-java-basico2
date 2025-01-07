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

// import java.util.Scanner;

// public class ContaTerminal {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             // Solicitar e capturar número da conta
//             System.out.println("Digite o número da sua conta bancária:");
//             int conta = scanner.nextInt();

//             // Solicitar e capturar número da agência
//             System.out.println("Agora, digite o número da sua agência bancária:");
//             scanner.nextLine(); // Consumir o "\n" pendente
//             String agencia = scanner.nextLine();

//             // Solicitar e capturar o nome completo
//             System.out.println("Digite o seu nome completo:");
//             String nome = scanner.nextLine();

//             // Solicitar e capturar o saldo
//             System.out.println("Digite agora o saldo que devera ser retirado da conta bancaria:");
//             double saldo = scanner.nextDouble();

//             // Exibir mensagem formatada
//             System.out.println(String.format(
//                 "Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d, e seu saldo de R$ %.2f já está disponível para saque.",
//                 nome, agencia, conta, saldo
//             ));
//         }
//     }
// }
