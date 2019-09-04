package app.transportes;

import app.interfaces.IEsMagico;

/**
 * TrenExpressoHowards
 */
public class TrenExpressoHogwarts extends Transporte implements IEsMagico {

    public TrenExpressoHogwarts(String nombre) {
        super(nombre);

    }

    public boolean esInvisibleAMuggles() {
        return true;
    }

    public boolean esInvisible() {
        return false;
    }

}