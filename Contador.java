import java.util.Scanner;

public class Contador
{
    public static void main(String[] args)
    {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try
        {
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException e)
        {
           System.out.println("Erro: " + e.getMessage());
        }

        terminal.close();
    }

    public static void contar(int valor1, int valor2) throws ParametrosInvalidosException
    {
        if(valor1 > valor2)
        {
            throw new ParametrosInvalidosException("O primeiro valor não deve ser maior que o segundo");
        }

        int iteracoes = valor2 - valor1;
        for(int i = 1;i <= iteracoes;i++)
        {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
