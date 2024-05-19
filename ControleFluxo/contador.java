import java.util.Scanner;

public class contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o Segundo Numero");
        int segundoNumero = scanner.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("Primiero numero deve ser menor que o segundo");
        }

        int quantidadeInteracoes = segundoNumero - primeiroNumero;

        for (int i = 1; i <= quantidadeInteracoes; i++) {
            System.out.println("Interacao de Numero :" + i);
        }

    }

}
