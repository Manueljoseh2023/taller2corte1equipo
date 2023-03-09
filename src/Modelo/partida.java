package Modelo;
public class partida {
    private int Val_resultado;
    private Superheroe Atacante;
    private Superheroe Victima;
    private Escudo escudo;
    private Arma arma; 

    public int getVal_resultado() {
        return Val_resultado;
    }

    public void setVal_resultado(int Val_resultado) {
        this.Val_resultado = Val_resultado;
    }

    public void setAtacante(Superheroe Atacante) {
        this.Atacante = Atacante;
    }

    public void setVictima(Superheroe Victima) {
        this.Victima = Victima;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Superheroe getAtacante() {
        return Atacante;
    }

    public Superheroe getVictima() {
        return Victima;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public Arma getArma() {
        return arma;
    }
            
}
