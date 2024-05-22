import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta !");
        int Numero = ler.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = ler.next();
        System.out.println("Por favor, digite o seu Nome !");
        String nomeCliente = ler.next();
        System.out.println("Por favor, digite o seu Saldo !");
        float Saldo = ler.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
    }
}
