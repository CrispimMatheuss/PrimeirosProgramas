import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        int[] cedulas = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] qtdCedula = {5, 1, 1, 44, 2, 1, 1, 1};
        int qtdeAtm = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int valorReais = Integer.parseInt(s.nextLine());


        for (int i = 0; i < qtdCedula.length; i++) {
            qtdeAtm += qtdCedula[i] * cedulas[i];
        }

        if (valorReais > qtdeAtm) {
            System.out.println("Saldo indisponível no caixa!");
        } else {

            for (int i = 0; i < cedulas.length; i++) {
                int quantidadeCedulas = valorReais / cedulas[i];
                int qtdRetirada = 0;
                int valorSacado = 0;
                boolean sacou = false;

                if (valorReais > 0 && valorReais >= cedulas[i]) {

                    while (qtdCedula[i] > 0 && quantidadeCedulas != qtdRetirada) {
                        qtdRetirada++;
                        qtdCedula[i] -= 1;
                        sacou = true;
                    }
                    if (sacou) {
                        valorSacado += qtdRetirada * cedulas[i];
                        valorReais -= valorSacado;
                        System.out.println("Quantidade de cedulas de " + cedulas[i] + ": " + qtdRetirada);
                    }
                }

            }
        }
    }
}

