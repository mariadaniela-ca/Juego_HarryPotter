package app.interfaces;

import app.personajes.Personaje;
import app.poderes.hechizos.Hechizo;

/**
 * IHacerMagia
 */
public interface IHacerMagia {

    public void getPoderInicial();

    public void aprender(Hechizo h);

    public void getArtefactos();

    public void atacar(Personaje p, Hechizo h);

    public void atacar(Personaje p, String nombreDeHechizo);

    

}

