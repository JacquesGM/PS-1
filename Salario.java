import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner receber = new Scanner(System.in);

        Double salario, desconto, salarioLiquido, valorDesconto;

        System.out.print("Salario: ");
        salario = receber.nextDouble();

        System.out.print("Desconto: ");
        desconto = receber.nextDouble();

        valorDesconto = salario * desconto;

        salarioLiquido = salario - valorDesconto;

        System.out.println("Salario ruto do funcionario: " + salario);
        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Salario liquido: " + salarioLiquido);
    }

}