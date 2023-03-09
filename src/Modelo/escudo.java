package Modelo;
public class escudo {
    private String nom_esc;
    private int prot_esc;
    public escudo(String nom_esc, int prot_esc){
        this.nom_esc=nom_esc;
        this.prot_esc=prot_esc;
}

    public void setNom_esc(String nom_esc) {
        this.nom_esc = nom_esc;
    }

    public void setProt_esc(int prot_esc) {
        this.prot_esc = prot_esc;
    }

    public String getNom_esc() {
        return nom_esc;
    }

    public int getProt_esc() {
        return prot_esc;
    }
}