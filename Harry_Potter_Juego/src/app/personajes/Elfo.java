package app.personajes;

import app.interfaces.IHacerMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

/**
 * Elfo
 */
public class Elfo extends Criatura implements IHacerMagia{

    
    public Elfo(String nombre) {
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
        p.salud = p.salud - h.nivelDeDaño;

    }


 
    public void atacar(Personaje p, String nombreDeHechizo) {
		
	}

    public void setPoderInicial() {

    }

    
}