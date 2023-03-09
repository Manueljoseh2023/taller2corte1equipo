package Modelo;
public class arma {
    private String nom_arma;
    private int daño_arma;
    public armas (String nom_arma, int daño_arma){
        this.nom_arma= nom_arma;
        this.daño_arma=daño_arma;
    }

    public String getNom_arma() {
        return nom_arma;
    }

    public int getDaño_arma() {
        return daño_arma;
    }

    public void setNom_arma(String nom_arma) {
        this.nom_arma = nom_arma;
    }

    public void setDaño_arma(int daño_arma) {
        this.daño_arma = daño_arma;
    }

}

