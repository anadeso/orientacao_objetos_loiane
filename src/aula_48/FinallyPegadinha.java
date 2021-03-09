package aula_48;

public class FinallyPegadinha {

    public static void main(String[] args) {

        int[] numero = {4,8,16,32,64,128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i=0; i<numero.length; i++){
            try{
                System.out.println(numero[i] + "/"+ demon[i] + " = " + (numero[i]/demon[i]));
            }
            catch(ArithmeticException e1){
                System.out.println("Erro por dividir por zero");
                System.exit(0);
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Posicao de array não existe");
                System.exit(0);
            }
            finally {
                System.out.println("Essa linha é impressa sempre apos o try e catch");
            }
        }
    }
}
