package aula_51;

public class UsandoMinhaPropriaException {

    public static void main(String[] args) {

        try{
            teste();
        } catch (DivisaoNaoExata e) {
            e.printStackTrace();
        }
    }

    public static void teste() throws DivisaoNaoExata {

        int[] numero = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] demon = {2, 0, 4, 8, 0, 2, 4};

        for (int i=0; i<numero.length; i++){
            try{
                if(numero[i] % 2 != 0){
                    // lançar a exception aqui
                    throw new DivisaoNaoExata(numero[i], demon[i]);
                }
                System.out.println(numero[i] + "/"+ demon[i] + " = " +
                        (numero[i]/demon[i]));
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Aconteceu um erro");
                e.printStackTrace();
            }

        }
    }
}
