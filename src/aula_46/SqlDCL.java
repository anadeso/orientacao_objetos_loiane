package aula_46;

public interface SqlDCL {

    void grant(String query);
    void revoke(String query);

}
