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

    // piedra Filosofal ( da vida)
    // Espada de Godric Gryffindor ( quita mas vida);
    // Bludger (derribar, quita vida )
    // Galeón de oro (da mas vida)
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

    public boolean esReliquia() {
        return false;
    }

    public boolean esMagico() {
        return true;
    }
}

/*
 * System.out.println(" " + a.numeroDeArtefacto + "  " + a.nombre +
 * "\n     Amplificador de Salud : " + a.amplificadorDeSalud +
 * "\n     Amplificador de Daño: " + a.amplificadorDeDaño);
 */