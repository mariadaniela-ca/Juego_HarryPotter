package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * PiedraDeResurreccion
 */
public class PiedraDeResurreccion extends Artefacto implements IReliquiaMuerte{

    public PiedraDeResurreccion(String n) {
        super(n);
        
    }

    public boolean esReliquia() {
        return true;

    }

    
}