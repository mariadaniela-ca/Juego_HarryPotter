package app.artefactos;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.IReliquiaMuerte;

/**
 * Artefacto
 */
public class Artefacto implements IReliquiaMuerte{

    public String nombre;

    public Artefacto(String nombre) {
        this.nombre = nombre;
    }
public int amplificadorDeDaño;
public int amplificadorDeSalud;
    
	public List<IReliquiaMuerte> reliquias = new ArrayList<IReliquiaMuerte>();

    public void agregarReliquia() {

        CapaDeInvisibilidad capa = new CapaDeInvisibilidad("Capa de invisibilidad");
        capa.amplificadorDeDaño= 0;
        capa.amplificadorDeSalud= 20;
        reliquias.add(capa);

        PiedraDeResureccion piedra = new PiedraDeResureccion("Piedra de resureccion");
        piedra.amplificadorDeDaño=  0;
        piedra.amplificadorDeSalud= 100;
        reliquias.add(piedra);

        VaritaDeSauco varita = new VaritaDeSauco("Varita de Sauco");
        varita.amplificadorDeDaño = 20;
        varita.amplificadorDeSalud= 0;
        reliquias.add(varita);

    }
}