package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHacerMagia;
import app.poderes.hechizos.Hechizo;

/**
 * Wizard
 */
public class Wizard extends Persona implements IHacerMagia {

    public String escoba; // llamar a la lista escoba

    public List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public static List<Hechizo> hechizosAprendidos = new ArrayList<Hechizo>();

    public static boolean esMagoOscuro = false;

    public Wizard(String nombre) {
        super(nombre);

    }

    public void getPoderInicial() {

    }

    public void aprender(Hechizo h) {

        hechizosAprendidos.add(h);

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

    public static boolean comprobarSiEsMagoOscuro() {
        for (Hechizo r : hechizosAprendidos) {
            if (r.esOscuro) {
                esMagoOscuro = true;
                return esMagoOscuro;

            }
        }
        return false;

    }
}