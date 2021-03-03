package aula_43_labs_exerc3;

public class Peixe extends Animal{

    private String caracteristica;

    public Peixe() {
        super();
        this.setNumPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cizenta");
        this.caracteristica = "Barbatana e causa";
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        String s = super.toString();
            s += "\nCaracteríticas: " +caracteristica;
            return s;
    }
}
