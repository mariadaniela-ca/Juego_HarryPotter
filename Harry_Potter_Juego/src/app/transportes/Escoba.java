package app.transportes;

import app.interfaces.IEsMagico;

/**
 * Escoba
 */
public class Escoba extends Transporte implements IEsMagico {

    
    public boolean esMagico() {
        return true;
    }

}