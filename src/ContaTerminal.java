
import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número da agência: ");
        String agencia = sc.next();
        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Informe o nome do cliente: ");
        String nome = sc.next();
        System.out.print("Informe o saldo da conta: ");
        BigDecimal saldo = sc.nextBigDecimal();

        sc.close();

        System.out.printf("Olá "+nome
        +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia
        +", conta "+numero+" e seu saldo R$ %.2f já está disponível para saque.", saldo);
    }
}
