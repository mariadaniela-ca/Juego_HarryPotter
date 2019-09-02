package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHacerMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.poderes.hechizos.hechizosdefensa.HechizoDefensa;
import app.transportes.Escoba;

/**
 * Wizard
 */
public class Wizard extends Persona implements IHacerMagia {

    public Escoba escoba; // llamar a la lista escoba

    public List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public List<Hechizo> hechizosAprendidos = new ArrayList<Hechizo>();

    public boolean esMagoOscuro = false;

    private Poder poderInicial;
    public int energiaMagica = 100;

    public Wizard(String nombre) {
        super(nombre);

    }

    public Poder getPoderInicial() {
        return poderInicial;

    }

    public void aprender(Hechizo h) {

        hechizosAprendidos.add(h);

    }

    public List<Artefacto> getArtefactos() {
        return artefactos;

    }

    public void atacar(Personaje p, Hechizo h) {

        if (this.energiaMagica > h.nivelDeEnergia) {

            this.energiaMagica -= h.nivelDeEnergia;

            if (h.esOscuro) {
                h.nivelDeDaño = h.nivelDeDaño * 2;
                this.esMagoOscuro = true;
            }

            int dañoTotal = h.nivelDeDaño;

            for (Artefacto a : this.artefactos) {
                if (a.amplificadorDeDaño > 0) {
                    dañoTotal *= a.amplificadorDeDaño;
                }
            }

            int curacionTotal = 0;

            if (p instanceof IHacerMagia) {

                if (((IHacerMagia) p).getArtefactos().size() > 0) {

                    curacionTotal = h.nivelDeDaño;
                    for (Artefacto ar : ((IHacerMagia) p).getArtefactos()) {
                        if (ar.amplificadorDeSalud > 0) {
                            curacionTotal /= ar.amplificadorDeSalud;
                        }
                    }
                }
                System.out.println("atacante : " + this.nombre + " el enemigo es: " + p.nombre + " da;o total: "
                        + dañoTotal + " curacion total: " + curacionTotal);
                p.salud = p.salud - dañoTotal + curacionTotal;

            }
        }
    }

    public void atacar(Personaje p, String nombreDeHechizo) {

    }

    public void setPoderInicial(Poder p) {

        this.poderInicial = p;
    }

    public void defenderme(Personaje p, HechizoDefensa h) {
        p.salud = p.salud + h.nivelDeProteccion;
    }

}