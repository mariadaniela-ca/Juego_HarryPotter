package app.poderes.hechizos;

import java.util.ArrayList;
import java.util.List;

import app.poderes.Poder;
import app.poderes.hechizos.hechizosataque.Cruciatus;
import app.poderes.hechizos.hechizosataque.PetrificusTotalus;
import app.poderes.hechizos.hechizosataque.Sectumsempra;
import app.poderes.hechizos.hechizoscuracion.BrackiumEmendo;
import app.poderes.hechizos.hechizoscuracion.Reparifors;
import app.poderes.hechizos.hechizoscuracion.VulneraSanentur;
import app.poderes.hechizos.hechizosdefensa.CaveInimicum;
import app.poderes.hechizos.hechizosdefensa.ExpectoPatronum;
import app.poderes.hechizos.hechizosdefensa.Protego;

/**
 * Hechizo
 */
public class Hechizo extends Poder {

    public String nombre;
    public boolean esOscuro;
    public int nivelDeDaño;
    public int nivelDeCuracion;
    public int nivelDeProteccion;
    public int numeroDeHechizo;

    public static List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public Hechizo(String nombre) {
        this.nombre = nombre;

    }

    public Hechizo() {
    }

    public void cargarHechizos() {

        Cruciatus c = new Cruciatus("Cruciatus");
        c.numeroDeHechizo = 1;
        c.esOscuro = true;
        c.nivelDeCuracion = 0;
        c.nivelDeDaño = 50;
        c.nivelDeProteccion = 0;
        hechizos.add(c);

        PetrificusTotalus p = new PetrificusTotalus("Petrificus Totalus");
        c.numeroDeHechizo = 2;
        p.esOscuro = false;
        p.nivelDeCuracion = 0;
        p.nivelDeDaño = 20;
        p.nivelDeProteccion = 0;
        hechizos.add(p);

        Sectumsempra s = new Sectumsempra("Sectumsempra");
        c.numeroDeHechizo = 3;
        s.esOscuro = false;
        s.nivelDeCuracion = 0;
        s.nivelDeDaño = 10;
        s.nivelDeProteccion = 0;
        hechizos.add(s);

        BrackiumEmendo b = new BrackiumEmendo("Brackium Emendo");
        c.numeroDeHechizo = 4;
        b.esOscuro = false;
        b.nivelDeCuracion = 20;
        b.nivelDeDaño = 0;
        b.nivelDeProteccion = 0;
        hechizos.add(b);

        Reparifors re = new Reparifors("Reparifors");
        re.numeroDeHechizo = 5;
        re.esOscuro = false;
        re.nivelDeCuracion = 15;
        re.nivelDeDaño = 0;
        re.nivelDeProteccion = 0;
        hechizos.add(re);

        VulneraSanentur v = new VulneraSanentur("Vulnera Sanentur");
        c.numeroDeHechizo = 3;
        v.esOscuro = false;
        v.nivelDeCuracion = 20;
        v.nivelDeDaño = 0;
        v.nivelDeProteccion = 0;
        hechizos.add(v);

        CaveInimicum ci = new CaveInimicum("Cave Inimicum");
        c.numeroDeHechizo = 1;
        ci.esOscuro = false;
        ci.nivelDeCuracion = 0;
        ci.nivelDeDaño = 0;
        ci.nivelDeProteccion = 5;
        hechizos.add(ci);

        ExpectoPatronum e = new ExpectoPatronum("Expecto Patronum");
        c.numeroDeHechizo = 2;
        e.esOscuro = false;
        e.nivelDeCuracion = 0;
        e.nivelDeDaño = 0;
        e.nivelDeProteccion = 10;
        hechizos.add(e);

        Protego pr = new Protego("Protego");
        c.numeroDeHechizo = 3;
        pr.esOscuro = false;
        pr.nivelDeCuracion = 0;
        pr.nivelDeDaño = 0;
        pr.nivelDeProteccion = 15;
        hechizos.add(pr);

    }

}
