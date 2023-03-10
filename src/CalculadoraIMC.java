import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        String[] sobrenomes = new String[3];
        int[] qtdFilhos = new int[3];
        double[] pesoPessoa = new double[3];
        double[] alturaPessoa = new double[3];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = s.nextLine();
            nomes[i] = nome;

            System.out.print("Digite o sobrenome da pessoa: ");
            String sobrenome = s.nextLine();
            sobrenomes[i] = sobrenome;

            System.out.print("Quantidade de filhos: ");
            int qtdFilho = Integer.parseInt(s.nextLine());
            qtdFilhos[i] = qtdFilho;

            System.out.print("Peso: ");
            double peso = Double.parseDouble(s.nextLine());
            pesoPessoa[i] = peso;

            System.out.print("Altura: ");
            double altura = Double.parseDouble(s.nextLine());
            alturaPessoa[i] = altura;

        }

        for (int i = 0; i < 3; i++) {
            double imc = (pesoPessoa[i] / (alturaPessoa[i] * alturaPessoa[i]));
            System.out.println("A pessoa " + nomes[i] + " " + sobrenomes[i] + " tem " + qtdFilhos[i] + " filhos! Seu IMC é: " + imc);
        }
    }
}
