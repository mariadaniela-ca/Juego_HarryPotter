package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHacerMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

/**
 * Elfo
 */
public class Elfo extends Criatura implements IHacerMagia{

    public List<Hechizo> hechizosAprendidos = new ArrayList<Hechizo>();

    
    public Elfo(String nombre) {
        super(nombre);

    }

   
    public Poder getPoderInicial() {
        return null;
    }

    
    public void setPoderInicial(Poder p) {

    }

    
    public void aprender(Hechizo h) {

    }

   
    public List<Artefacto> getArtefactos() {
        return null;
    }

    public void atacar(Personaje p, Hechizo h) {


    }

   
    public void atacar(Personaje p, String nombreDeHechizo) {

    }

}