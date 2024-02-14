import java.util.Locale;
import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta ! : ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência! : ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Por favor, digite o saldo: ");
        Float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + " " + sobreNome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo é " + saldo + " e já está disponivel");

    }
}