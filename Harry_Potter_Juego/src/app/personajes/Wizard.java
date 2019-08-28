package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHacerMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

/**
 * Wizard
 */
public class Wizard extends Persona implements IHacerMagia{

    public String escoba; // llamar a la lista escoba

    public List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public boolean esMagoOscuro = false;

    public Wizard(String nombre) {
        super(nombre);

    }

    
    public void getPoderInicial() {

    }

    
    public void setPoderinicial(Poder p) {

    }

   
    public void aprender(Hechizo h) {

    }

    
    public void getArtefactos() {

    }

   
    public void atacar(Personaje p, Hechizo h) {

    }

    
    public void atacar(Personaje p, String nombreDeHechizo) {

	}
}