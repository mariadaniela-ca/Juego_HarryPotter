package app.transportes;

import app.interfaces.IEsMagico;

/**
 * Escoba
 */
public class Escoba extends Transporte implements IEsMagico {

    
    public Escoba(String nombre) {
        super(nombre);
        
    }

    public boolean esMagico() {
        return true;
    }

}