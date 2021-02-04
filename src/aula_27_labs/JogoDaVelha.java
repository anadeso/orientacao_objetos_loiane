package aula_27_labs;

public class JogoDaVelha {

    char[][] jogoVelha;
    int jogada;

    // Boa pratica termos construtor vazio
    public JogoDaVelha() {

    }

    public void jogoDaVelha(){
        jogoVelha = new char[3][3];
        jogada = 1;
    }

    boolean validarJogada(int linha, int coluna, char sinal){

        if(jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
            return false;
        } else{
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }

    }

    void imprimirTabuleiro(){

        for(int i=0; i<jogoVelha.length; i++){
            for(int j=0; j<jogoVelha[i].length; j++){
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }

    }

    boolean verificarGanhador(char sinal){

        if((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) ||  // LINHA 1
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || // LINHA 2
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || // LINHA 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) ||
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) ||
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal)){

            return true;
        }

        return false;

    }

    boolean vezJogador1(){
        if (jogada % 2 == 1){ //jogador 1
            return true;
        } else{
            return false;
        }
    }

}
