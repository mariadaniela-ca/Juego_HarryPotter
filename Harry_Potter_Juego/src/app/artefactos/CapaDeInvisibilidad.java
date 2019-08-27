package app.artefactos;

import app.interfaces.IReliquiaMuerte;


/**
 * CapaDeInvisibilidad
 */
public class CapaDeInvisibilidad extends Reliquia implements IReliquiaMuerte{

    public CapaDeInvisibilidad(String n) {
        super(n);
      
        
    }

 
    public boolean esReliquia() {
        return true;
    }

    
    
   
}