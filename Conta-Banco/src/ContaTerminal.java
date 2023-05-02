import java.util.Scanner;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        

        System.out.println("Por favor, Digite o numero da conta:");
        int numeroConta = entrada.nextInt();
        String resto = entrada.nextLine();
        System.out.println("Por favor, Digite o numero da agência:");
        String numeroAgencia = entrada.nextLine();
        System.out.println("Por favor, Digite o nome do cliente:");
        String nomeCliente = entrada.nextLine();
        System.out.println("Por favor, Digite o saldo:");
        Double saldo = entrada. nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é a "+numeroAgencia+", conta número "+numeroConta+" e o seu saldo de R$"+saldo+" já esta disponível para saque");








    }
}
