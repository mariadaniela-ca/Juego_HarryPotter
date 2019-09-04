package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHacerMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.poderes.hechizos.hechizosdefensa.HechizoDefensa;

/**
 * Wizard
 */
public class Wizard extends Persona implements IHacerMagia {

    public List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public List<Hechizo> hechizosAprendidos = new ArrayList<Hechizo>();

    public boolean esMagoOscuro = false;

    public Poder poderInicial;
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

    public void setPoderInicial(Poder p) {

        this.poderInicial = p;
    }

    public void defenderme(Personaje p, HechizoDefensa h) {
        p.salud = p.salud + h.nivelDeProteccion;
    }

}