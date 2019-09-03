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
public class Elfo extends Criatura implements IHacerMagia {

    public List<Hechizo> hechizosAprendidos = new ArrayList<Hechizo>();

    public Poder poderInicial;
    public int energiaMagica = 100;

    public Elfo(String nombre) {
        super(nombre);

    }

    public Poder getPoderInicial() {
        return poderInicial;
    }

    public void setPoderInicial(Poder p) {
        this.poderInicial = p;
    }

    public void aprender(Hechizo h) {

        hechizosAprendidos.add(h);
    }

    public List<Artefacto> getArtefactos() {
        return null;
    }

    public void atacar(Personaje p, Hechizo h) {
        if (this.energiaMagica > h.nivelDeEnergia) {

            this.energiaMagica -= h.nivelDeEnergia;

            int dañoTotal = h.nivelDeDaño;

            if (p instanceof Wizard) {
                if (((Wizard) p).getArtefactos().size() > 0) {
                    for (Artefacto ar : ((Wizard) p).getArtefactos()) {
                        if (ar.amplificadorDeSalud > 0) {
                            dañoTotal /= ar.amplificadorDeSalud;
                        }
                    }
                }
            }

            p.salud -= dañoTotal;
        }
    }
        
    

    public void atacar(Personaje p, String nombreDeHechizo) {
        Hechizo hechizito = null;
        for (Hechizo h : hechizosAprendidos) {
            if (h.nombre.equals(nombreDeHechizo)) {
                hechizito = h;
                break;
            }
        }

        atacar(p, hechizito);

    }
}
