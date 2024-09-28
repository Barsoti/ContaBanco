import java.util.Locale;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ContaTerminal {

    public static void main(String[] args) {
        // TODO:
        // Conhecer e importar a classe Scanner
        // Exbir as mensagens para o usuário
        // Obter pela classe Scanner os valores digitados no terminal
        // Exibir a mensagem da conta criada

        //Declara as variáveis
        int numeroConta = 1000;
        String agencia;
        String nomeCliente;
        double saldoConta;


        //Criar o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        //Coleta de informação do novo cliente
        System.out.println("Olá, por favor digite o seu nome completo:");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite agora o valor de depósito inicial para a abertura da conta:");
        saldoConta = scanner.nextDouble();

        agencia = "0001-0";
        numeroConta++;

        System.out.println("Olá " + nomeCliente + ", obrigado por cria a conta conosco!");
        System.out.println("Sua agência é a " + agencia + " e sua conta é a número " + numeroConta);
        System.out.println("Atualmente seu saldo é de: R$ " + saldoConta);
        System.out.println("Obrigado!");

        


    }

}
