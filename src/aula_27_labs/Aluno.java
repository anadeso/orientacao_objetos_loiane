package aula_27_labs;

public class Aluno {

    String nome;
    int matricula;
    String curso;
    String[] nomeDisciplina = new String[3];
    double[][] notasDisciplina = new double[3][4];

   void mostrarInfo(){

       System.out.println("Nome " +nome);
       System.out.println("Matricula " +matricula);
       System.out.println("Nome do curso " +curso);

       for(int i=0; i<notasDisciplina.length; i++){
           System.out.println("Notas da disciplina " +nomeDisciplina);
           for(int j=0; j<notasDisciplina[i].length; j++){
               System.out.print(notasDisciplina[i][j] + " ");
           }
           System.out.println();

       }
   }

    boolean verificarAprocado(int indice){

        double soma = 0;

        for(int i=0; i<notasDisciplina[indice].length; i++){
            soma += notasDisciplina[indice][i];
        }

        double media = soma/4;

        if(media >= 7){
            return true;
        }

        return false;
    }

}
