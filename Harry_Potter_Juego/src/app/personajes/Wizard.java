package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHacerMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.poderes.hechizos.hechizoscuracion.HechizoCuracion;
import app.poderes.hechizos.hechizosdefensa.HechizoDefensa;
import app.transportes.Escoba;

/**
 * Wizard
 */
public class Wizard extends Persona implements IHacerMagia {

    public Escoba escoba; // llamar a la lista escoba

    public List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public static List<Hechizo> hechizosAprendidos = new ArrayList<Hechizo>();

    public static boolean esMagoOscuro = false;

    private Poder poderInicial;

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

    public void defenderme(Personaje p, HechizoDefensa h ){
        p.salud = p.salud + h.nivelDeProteccion;
    }
    public void curarme(Personaje p, HechizoCuracion h){
        p.salud = p.salud+ h.nivelDeCuracion;
    }






    public void setPoderInicial(Poder p) {

        this.poderInicial = p;
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