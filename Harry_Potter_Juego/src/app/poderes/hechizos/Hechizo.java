package app.poderes.hechizos;

import java.util.ArrayList;
import java.util.List;

import app.poderes.Poder;
import app.poderes.hechizos.hechizosataque.Cruciatus;
import app.poderes.hechizos.hechizosataque.PetrificusTotalus;
import app.poderes.hechizos.hechizosataque.Sectumsempra;
import app.poderes.hechizos.hechizoscuracion.BrackiumEmendo;
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

    public static List<Hechizo> hechizosAtaques = new ArrayList<Hechizo>();
    public static List<Hechizo> hechizosCuracion = new ArrayList<Hechizo>();
    public static List<Hechizo> hechizosDefensa = new ArrayList<Hechizo>();
    public static List<Hechizo> hechizosOcio = new ArrayList<Hechizo>();


    public Hechizo(String nombre) {
        this.nombre = nombre;

    }

    public Hechizo() {
    }
    
	public static <Reparisfors> void cargarHechizos() {

        Cruciatus c = new Cruciatus("Cruciatus");
        c.numeroDeHechizo = 1;
        c.esOscuro = true;
        c.nivelDeCuracion = 0;
        c.nivelDeDaño = 50;
        c.nivelDeProteccion = 0;
        hechizosAtaques.add(c);

        PetrificusTotalus p = new PetrificusTotalus("Petrificus Totalus");
        c.numeroDeHechizo = 2;
        p.esOscuro = false;
        p.nivelDeCuracion = 0;
        p.nivelDeDaño = 20;
        p.nivelDeProteccion = 0;
        hechizosAtaques.add(p);

        Sectumsempra s = new Sectumsempra("Sectumsempra");
        c.numeroDeHechizo = 3;
        s.esOscuro = false;
        s.nivelDeCuracion = 0;
        s.nivelDeDaño = 10;
        s.nivelDeProteccion = 0;
        hechizosAtaques.add(s);

        BrackiumEmendo b = new BrackiumEmendo("Brackium Emendo");
        c.numeroDeHechizo = 1;
        b.esOscuro = false;
        b.nivelDeCuracion = 20;
        b.nivelDeDaño = 0;
        b.nivelDeProteccion = 0;
        hechizosCuracion.add(b);

        /*Reparisfors r = new Reparisfors("Refarisfors");
        c.numeroDeHechizo = 2;
        r.esOscuro = false;
        r.nivelDeCuracion = 15;
        r.nivelDeDaño = 0;
        r.nivelDeProteccion = 0;
        hechizosCuracion.add(r);
        */

        VulneraSanentur v = new VulneraSanentur("Vulnera Sanentur");
        c.numeroDeHechizo = 3;
        v.esOscuro = false;
        v.nivelDeCuracion = 20;
        v.nivelDeDaño = 0;
        v.nivelDeProteccion = 0;
        hechizosCuracion.add(v);

        CaveInimicum ci = new CaveInimicum("Cave Inimicum");
        c.numeroDeHechizo = 1;
        ci.esOscuro = false;
        ci.nivelDeCuracion = 0;
        ci.nivelDeDaño = 0;
        ci.nivelDeProteccion = 5;
        hechizosDefensa.add(ci);

        ExpectoPatronum e = new ExpectoPatronum("Expecto Patronum");
        c.numeroDeHechizo = 2;
        e.esOscuro = false;
        e.nivelDeCuracion = 0;
        e.nivelDeDaño = 0;
        e.nivelDeProteccion = 10;
        hechizosDefensa.add(e);

        Protego pr = new Protego("Protego");
        c.numeroDeHechizo = 3;
        pr.esOscuro = false;
        pr.nivelDeCuracion = 0;
        pr.nivelDeDaño = 0;
        pr.nivelDeProteccion = 15;
        hechizosDefensa.add(pr);

    }

    public static void mostrarHechizos() {
        System.out.println(" Los hechizos de Ataque son: ");
        for (Hechizo a : hechizosAtaques) {
            System.out.println( a.numeroDeHechizo + " " + a.nombre + "\n");
        }

    }

}

        
    
    


