import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 1500;
        double valorSolicitado;

        System.out.println("Favor digite o valor do saque: ");

        valorSolicitado = sc.nextDouble();

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("Saque Realizado com sucesso");
            System.out.println("Seu novo saldo é :" + saldo);
        }

        else

            System.out.println("Saldo insuficiente");

        sc.close();

    }

}
