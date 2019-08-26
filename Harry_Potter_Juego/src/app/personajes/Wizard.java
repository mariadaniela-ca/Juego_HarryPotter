package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.poderes.hechizos.Hechizo;

/**
 * Wizard
 */
public class Wizard extends Persona {

    public String escoba; // llamar a la lista escoba

    public List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public boolean esMagoOscuro = false;

    public Wizard(String nombre) {
        super(nombre);

    }
}