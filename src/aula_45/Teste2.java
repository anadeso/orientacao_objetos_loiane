package aula_45;

public class Teste2 {

    public static void main(String[] args) {

        // Exemp1 - OK
        // Downcasting
        // Conseguimos fazer o downcastion pois obj1 retorna uma String
        Object obj1 = obterString();
        String s1 = (String) obj1;

        // Exemp2 - Ok
        // pois estamos atribuindo ao obj2 uma String diretamente
        Object obj2 = "Minha String";  // Esse exemplo de Upcasting, transf uma sub em super classe
        String s2 = (String) obj2;     // Esse exmplo de Dowcasting, transf uma superclasse em subclasse

        // Exemp3 - FALHA EM TEMPO EXECUCAO
        // Downcasting
        // Veja que aqui teremos um erro de execucao, pois obj3 nao tem nenhuma referencia de String
        Object obj3 = new Object();
        String s3 = (String) obj3;

        // Exemp4 - FALHA EM TEMPO EXECUCAO
        // Downcasting
        // Nao funciona em tempo de execucao, pois estou esperando uma Int e nao uma String
        Object obj4 = obterInt();
        String s4 = (String) obj4;
    }

    public static String obterString(){
        return "minha String";
    }

    public static int obterInt(){
        return 1;
    }
}
