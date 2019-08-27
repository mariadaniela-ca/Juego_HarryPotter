package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * VaritaDeSauco
 */
public class VaritaDeSauco extends Varita implements IReliquiaMuerte{

    public VaritaDeSauco(String n) {
        super(n);
    
    }

    
    public boolean esReliquia() {
        return true;

    }
    
}