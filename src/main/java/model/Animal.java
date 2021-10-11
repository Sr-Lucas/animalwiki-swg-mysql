package model;

public class Animal {
    private int codigo;
    private Especie especie;
    private String tempoDeVida;
    private String detalhes;
    private String habitatNatural;

    public Animal(Especie especie, String tempoDeVida, String detalhes,String habitatNatural) {
        this.especie = especie;
        this.tempoDeVida = tempoDeVida;
        this.detalhes = detalhes;
        this.habitatNatural = habitatNatural;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Especie getEspecie() {
        return especie;
    }

    public String getTempoDeVida() {
        return tempoDeVida;
    }

    public void setTempoDeVida(String tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getHabitatNatural() {
        return habitatNatural;
    }

    public void setHabitatNatural(String habitatNatural) {
        this.habitatNatural = habitatNatural;
    }
}
