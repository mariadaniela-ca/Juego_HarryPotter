package app.personajes;

import app.interfaces.IEsMagico;

/**
 * Criatura
 */
public class Criatura extends Personaje implements IEsMagico {

    public int nivelDeDaño;

    public Criatura(String nombre) {
        super(nombre);

    }

 
    public boolean esInvisibleAMuggles() {
        return false;
    }

    public boolean esInvisible() {
        return false;
    }



}