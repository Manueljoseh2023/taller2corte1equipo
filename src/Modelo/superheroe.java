package Modelo; 
public class superheroe {
    private String nom_heroe;
    private int salud;
    public superheroe(String nom_heroe, int salud){
        this.nom_heroe=nom_heroe;
        this.salud=salud;
    }

    public void setNom_heroe(String nom_heroe) {
        this.nom_heroe = nom_heroe;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNom_heroe() {
        return nom_heroe;
    }

    public int getSalud() {
        return salud;
    }
    
}
