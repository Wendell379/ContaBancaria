
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            conta conta = new conta();
            double valor = 0;

            conta.setValor(valor);
            conta.setTitular("Pablo");
            IO.println("Ola " + conta.getTitular());
            IO.println("Deseja: ");
            IO.println("Saldo " + conta.getSaldo());
            IO.println("(1) Sacar");
            IO.println("(2) Depositar");
            int decisao = scanner.nextInt();

            if (decisao == 1) {
                IO.println("Deseja sacar quanto: ");
                IO.println("(1)R$10,00");
                IO.println("(2)R$50,00");
                IO.println("(3)R$100,00");
                int saque = scanner.nextInt();
                if (saque == 1) {
                    valor += 5;
                    conta.setValor(valor);
                    conta.sacar();
                } else if (saque == 2) {
                    valor += 50;
                    conta.setValor(valor);
                    conta.sacar();
                } else if (saque == 3) {
                    valor += 100;
                    conta.setValor(valor);
                    conta.sacar();
                }

            } else if (decisao == 2) {
                IO.println(conta.depositar());
                IO.println("Deseja depositar quanto: ");
                IO.println("(1)R$10,00");
                IO.println("(2)R$50,00");
                IO.println("(3)R$100,00");

            }


        }
    }