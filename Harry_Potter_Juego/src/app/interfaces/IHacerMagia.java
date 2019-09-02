package app.interfaces;

import java.util.List;

import app.artefactos.Artefacto;
import app.personajes.Personaje;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

/**
 * IHacerMagia
 */
public interface IHacerMagia {

	Poder getPoderInicial();

    void setPoderInicial(Poder p);

    void aprender(Hechizo h);

    List<Artefacto> getArtefactos();

    void atacar(Personaje p, Hechizo h);

    void atacar(Personaje p, String nombreDeHechizo);

    

}

