
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CallCenter {

    Queue<String> fila = new LinkedList<>();
    Scanner s = new Scanner(System.in);
    int opcaoSelecionada = 0;
    String nome = "";
    String telefone = "";
    String endereco = "";
    ArrayList<String> nomeCliente = new ArrayList<>();
    ArrayList<String> contatoCliente = new ArrayList<>();
    ArrayList<String> enderecoCliente = new ArrayList<>();

    //int i = nomeCliente.size();
    public int callCenter() {
        System.out.println("Bem vindo ao Sistema de Call Center");
        System.out.println("Digite abaixo a opção desejada");
        System.out.println("1 - Inserir Cliente");
        System.out.println("2 - Ligar para cliente");
        System.out.println("3 - Mostrar clientes cadastrados");
        System.out.println("4 - Ver fila");
        System.out.println("9 - Sair");
        System.out.print("Opção: ");
        opcaoSelecionada = Integer.parseInt(s.nextLine());

        return opcaoSelecionada;
    }

    public void adicionarCliente(){
        System.out.print("Nome do cliente: ");
        nome = s.nextLine();

        System.out.print("Contato: ");
        telefone = s.nextLine();

        System.out.print("Endereço: ");
        endereco = s.nextLine();

        System.out.print("Deseja realizar o cadastro de " + nome + " ? (1 - Sim / 2 - Não): ");
        int cadastrar = Integer.parseInt(s.nextLine());

        if (cadastrar == 1){
            int i = nomeCliente.size();

            nomeCliente.add(i, nome);
            contatoCliente.add(i, telefone);
            enderecoCliente.add(i, endereco);
            String x = Integer.toString(i);
            fila.add(x);
        }

    }

    public void atenderCliente(){
        if (!fila.isEmpty()){
            String i = fila.peek();
            int x = Integer.parseInt(i);

            System.out.println("Cliente");
            System.out.println("Nome: " + nomeCliente.get(x));
            System.out.println("Contato: " + contatoCliente.get(x));
            System.out.println("Endereço: " + enderecoCliente.get(x));

            System.out.print("O cliente " + nomeCliente.get(0) + " foi atendido? (1 - Sim / 2 - Não): ");
            int opcao = Integer.parseInt(s.nextLine());
            if (opcao == 1){
                fila.poll();
                nomeCliente.remove(0);
                contatoCliente.remove(0);
                enderecoCliente.remove(0);

                while (!fila.isEmpty()){
                    fila.remove();
                }

                for (int p = 0; p < nomeCliente.size(); p++){
                    fila.add(Integer.toString(p));
                }

            } else {
                int y = nomeCliente.size() ;
                nomeCliente.add(y, nomeCliente.get(0));
                contatoCliente.add(y, contatoCliente.get(0));
                enderecoCliente.add(y, enderecoCliente.get(0));
                String z = Integer.toString(y);
                fila.add(z);
                nomeCliente.remove(0);
                contatoCliente.remove(0);
                enderecoCliente.remove(0);

                while (!fila.isEmpty()){
                    fila.remove();
                }

                for (int p = 0; p < nomeCliente.size(); p++){
                    fila.add(Integer.toString(p));
                }

            }
        }

    }

    public void listarClientes(){
        for (int i = 0; i < nomeCliente.size(); i++){
            System.out.println("Código: " + (i + 1) + " - " +  nomeCliente.get(i) + " | Telefone: " + contatoCliente.get(i) + " | Cidade: " + enderecoCliente.get(i));
        }
        System.out.println("Pressione ENTER para voltar ao Menu: ");
        s.nextLine();
    }

    public void mostrarFila() {

        if (!fila.isEmpty()) {
            System.out.println(fila);
        } else {
            System.out.println("Fila vazia!");
        }
        System.out.println("Pressione ENTER para voltar ao Menu: ");
        s.nextLine();
    }

    public static void main(String[] args) {

        CallCenter filaCallCenter = new CallCenter();
        filaCallCenter.callCenter();

        int getOpcao = filaCallCenter.getOpcaoSelecionada();

        while(getOpcao != 9){
            if (getOpcao == 1){
                filaCallCenter.adicionarCliente();
                filaCallCenter.callCenter();
            }
            if (getOpcao == 2){
                filaCallCenter.atenderCliente();
                filaCallCenter.callCenter();
            }
            if (getOpcao == 3){
                filaCallCenter.listarClientes();
                filaCallCenter.callCenter();
            }
            if (getOpcao == 4){
                filaCallCenter.mostrarFila();
                filaCallCenter.callCenter();
            }
            getOpcao = filaCallCenter.getOpcaoSelecionada();
        }


    }

    public int getOpcaoSelecionada() {
        return opcaoSelecionada;
    }
}
