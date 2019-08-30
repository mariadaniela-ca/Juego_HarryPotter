package app.transportes;

import app.interfaces.IEsMagico;

/**
 * TrenExpressoHowards
 */
public class TrenExpressoHogwarts extends Transporte implements IEsMagico{

    
    public boolean esMagico() {
        return true;
    }

    
}