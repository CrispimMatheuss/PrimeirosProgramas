public class JogoDaVelha_1 {
    public static void main(String[] args) {
        String[][] jogoDaVelha;

        jogoDaVelha = new String[3][3];
        //jogoDaVelha = new String[linha][coluna];
        jogoDaVelha[0] = new String[]{"O", "X", "O"};
        jogoDaVelha[1] = new String[]{"X", "X", "X"};
        jogoDaVelha[2] = new String[]{"X", "O", "O"};

        for (int i = 0; i < jogoDaVelha.length; i++){
            System.out.print("Linha " + i + " :");
            String linha = "";
            for (int j = 0; j < jogoDaVelha[i].length; j++){
                linha += " " + jogoDaVelha[i][j];
            }
            System.out.print(linha+"\n");
        }

        if ((jogoDaVelha[0][0] == "X" && jogoDaVelha[0][1] == "X" && jogoDaVelha[0][2] == "X") || (jogoDaVelha[0][0] == "O" && jogoDaVelha[0][1] == "O" && jogoDaVelha[0][2] == "O")){
            System.out.println("Ganhou [0,0] - [0,1] - [0,2]");
        }

        if ((jogoDaVelha[1][0] == "X" && jogoDaVelha[1][1] == "X" && jogoDaVelha[1][2] == "X") || (jogoDaVelha[1][0] == "O" && jogoDaVelha[1][1] == "O" && jogoDaVelha[1][2] == "O")){
            System.out.println("Ganhou [1,0] - [1,1] - [1,2]");
        }

        if ((jogoDaVelha[2][0] == "X" && jogoDaVelha[2][1] == "X" && jogoDaVelha[2][2] == "X") || (jogoDaVelha[2][0] == "O" && jogoDaVelha[2][1] == "O" && jogoDaVelha[2][2] == "O")){
            System.out.println("Ganhou [2,0] - [2,1] - [2,2]");
        }

        if ((jogoDaVelha[0][0] == "X" && jogoDaVelha[1][0] == "X" && jogoDaVelha[2][0] == "X") || (jogoDaVelha[0][0] == "O" && jogoDaVelha[1][0] == "O" && jogoDaVelha[2][0] == "O")){
            System.out.println("Ganhou [0,0] - [1,0] - [2,0]");
        }

        if ((jogoDaVelha[0][1] == "X" && jogoDaVelha[1][1] == "X" && jogoDaVelha[2][1] == "X") || (jogoDaVelha[0][1] == "O" && jogoDaVelha[1][1] == "O" && jogoDaVelha[2][1] == "O")){
            System.out.println("Ganhou [0,1] - [1,1] - [2,1]");
        }

        if ((jogoDaVelha[0][2] == "X" && jogoDaVelha[1][2] == "X" && jogoDaVelha[2][2] == "X") || (jogoDaVelha[0][2] == "O" && jogoDaVelha[1][2] == "O" && jogoDaVelha[2][2] == "O")){
            System.out.println("Ganhou [0,2] - [1,2] - [2,2]");
        }

        if ((jogoDaVelha[0][0] == "X" && jogoDaVelha[1][1] == "X" && jogoDaVelha[2][2] == "X") || (jogoDaVelha[0][0] == "O" && jogoDaVelha[1][1] == "O" && jogoDaVelha[2][2] == "O")){
            System.out.println("Ganhou [0,0] - [1,1] - [2,2]");
        }

        if ((jogoDaVelha[0][2] == "X" && jogoDaVelha[1][1] == "X" && jogoDaVelha[2][0] == "X") || (jogoDaVelha[0][2] == "O" && jogoDaVelha[1][1] == "O" && jogoDaVelha[2][0] == "O")){
            System.out.println("Ganhou [0,2] - [1,1] - [2,0]");
        }
    }
}
