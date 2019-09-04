package app.artefactos;

import app.interfaces.IEsMagico;

/**
 * Artefacto
 */
public class Artefacto implements IEsMagico {

    public String nombre;

    public Artefacto(String n) {
        this.nombre = n;
    }

    public int amplificadorDeDaño;

    public int amplificadorDeSalud;

    public int numeroDeArtefacto;

    public Artefacto() {

    }

    public boolean esInvisibleAMuggles() {
        return false;
    }

    public boolean esInvisible() {
        return false;
    }

    public int getAmplificadordeDaño() {
        return this.amplificadorDeDaño;

    }

    public int getAmplificadordeSalud() {
        return this.amplificadorDeDaño;

    }

}
