package aula_27_labs;

public class Lampada {

    String cor;
    String tensao;
    String tipoLuz;
    String [] tipos;
    int garantiaMeses;
    int poetencia;
    boolean tipoAbajur;

    boolean ligada;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void mostrarEstado(){

        if(ligada){
            System.out.println("Lâmpada ligada!");
        } else {
            System.out.println("Lâmpada desligada!");
        }
    }

    public void mudarEstado(){
        if(ligada){
            desligar();
        } else {
            ligar();
        }
    }

}
