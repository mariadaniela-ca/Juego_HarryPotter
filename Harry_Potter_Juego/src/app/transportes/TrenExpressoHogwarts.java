package app.transportes;

import app.interfaces.IEsMagico;

/**
 * TrenExpressoHowards
 */
public class TrenExpressoHogwarts extends Transporte implements IEsMagico{

    
    public TrenExpressoHogwarts(String nombre) {
        super(nombre);
        
    }

    public boolean esMagico() {
        return true;
    }
   
}