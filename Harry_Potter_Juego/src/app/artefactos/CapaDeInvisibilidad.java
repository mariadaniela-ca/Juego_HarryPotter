package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * CapaDeInvisibilidad
 */
public class CapaDeInvisibilidad extends Artefacto implements IReliquiaMuerte {

    public CapaDeInvisibilidad(String n) {
        super(n);

    }

    public boolean esReliquia() {
        return true;
    }
}
