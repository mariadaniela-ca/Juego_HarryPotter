package app.poderes.hechizos;

import java.util.ArrayList;
import java.util.List;

import app.poderes.Poder;
import app.poderes.hechizos.hechizosataque.Cruciatus;
import app.poderes.hechizos.hechizosataque.HechizoAtaque;
import app.poderes.hechizos.hechizosataque.PetrificusTotalus;
import app.poderes.hechizos.hechizosataque.Sectumsempra;
import app.poderes.hechizos.hechizoscuracion.BrackiumEmendo;
import app.poderes.hechizos.hechizoscuracion.HechizoCuracion;
import app.poderes.hechizos.hechizoscuracion.Reparifors;
import app.poderes.hechizos.hechizoscuracion.VulneraSanentur;
import app.poderes.hechizos.hechizosdefensa.CaveInimicum;
import app.poderes.hechizos.hechizosdefensa.ExpectoPatronum;
import app.poderes.hechizos.hechizosdefensa.HechizoDefensa;
import app.poderes.hechizos.hechizosdefensa.Protego;
import app.poderes.hechizos.hechizosocio.Accio;
import app.poderes.hechizos.hechizosocio.Bauleo;
import app.poderes.hechizos.hechizosocio.HechizoOcio;
import app.poderes.hechizos.hechizosocio.WingardiumLeviosa;

/**
 * Hechizo
 */
public class Hechizo extends Poder {

    public String nombre;
    public boolean esOscuro;
    public int nivelDeDaño;
    public int nivelDeCuracion;
    public int nivelDeProteccion;
    public int identificador;

    public static List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public Hechizo(String nombre) {
        this.nombre = nombre;

    }

    public Hechizo() {
    }

    public void cargarHechizos() {

        Cruciatus c = new Cruciatus("Cruciatus");
        c.identificador = 1;
        c.esOscuro = true;
        c.nivelDeCuracion = 0;
        c.nivelDeDaño = 50;
        c.nivelDeProteccion = 0;
        hechizos.add(c);

        PetrificusTotalus p = new PetrificusTotalus("Petrificus Totalus");
        p.identificador = 2;
        p.esOscuro = false;
        p.nivelDeCuracion = 0;
        p.nivelDeDaño = 20;
        p.nivelDeProteccion = 0;
        hechizos.add(p);

        Sectumsempra s = new Sectumsempra("Sectumsempra");
        s.identificador = 3;
        s.esOscuro = false;
        s.nivelDeCuracion = 0;
        s.nivelDeDaño = 10;
        s.nivelDeProteccion = 0;
        hechizos.add(s);

        BrackiumEmendo b = new BrackiumEmendo("Brackium Emendo");
        b.identificador = 4;
        b.esOscuro = false;
        b.nivelDeCuracion = 20;
        b.nivelDeDaño = 0;
        b.nivelDeProteccion = 0;
        hechizos.add(b);

        Reparifors r = new Reparifors("Reparifors");
        r.identificador = 5;
        r.esOscuro = false;
        r.nivelDeCuracion = 25;
        r.nivelDeDaño = 0;
        r.nivelDeProteccion = 0;
        hechizos.add(r);

        VulneraSanentur v = new VulneraSanentur("Vulnera Sanentur");
        v.identificador = 6;
        v.esOscuro = false;
        v.nivelDeCuracion = 20;
        v.nivelDeDaño = 0;
        v.nivelDeProteccion = 0;
        hechizos.add(v);

        CaveInimicum ci = new CaveInimicum("Cave Inimicum");
        ci.identificador = 7;
        ci.esOscuro = false;
        ci.nivelDeCuracion = 0;
        ci.nivelDeDaño = 0;
        ci.nivelDeProteccion = 5;
        hechizos.add(ci);

        ExpectoPatronum e = new ExpectoPatronum("Expecto Patronum");
        e.identificador = 8;
        e.esOscuro = false;
        e.nivelDeCuracion = 0;
        e.nivelDeDaño = 0;
        e.nivelDeProteccion = 10;
        hechizos.add(e);

        Protego pr = new Protego("Protego");
        pr.identificador = 9;
        pr.esOscuro = false;
        pr.nivelDeCuracion = 0;
        pr.nivelDeDaño = 0;
        pr.nivelDeProteccion = 15;
        hechizos.add(pr);

        Accio acc = new Accio("Accio");
        acc.identificador = 10;
        acc.esOscuro = false;
        acc.nivelDeCuracion = 0;
        acc.nivelDeDaño = 0;
        acc.nivelDeProteccion = 0;
        hechizos.add(acc);

        Bauleo bau = new Bauleo("Bauleo");
        bau.identificador = 11;
        bau.esOscuro = false;
        bau.nivelDeCuracion = 0;
        bau.nivelDeDaño = 0;
        bau.nivelDeProteccion = 0;
        hechizos.add(bau);

        WingardiumLeviosa win = new WingardiumLeviosa("Wingardium Leviosa");
        win.identificador = 12;
        win.esOscuro = false;
        win.nivelDeCuracion = 0;
        win.nivelDeDaño = 0;
        win.nivelDeProteccion = 0;
        hechizos.add(win);

    }

    {

        /*
         * for (Hechizo a : hechizos) { System.out.println(a.numeroDeHechizo + " " +
         * a.nombre + "\n"); }
         */

    }

    int tipoHechizo1;
    int tipoHechizo2;
    int tipoHechizo3;

    int hechizoElegido1;
    int hechizoElegido2;
    int hechizoElegido3;

    public void elegirHechizo(int numero) {
    }

    public void mostrarHechizo() {

        /* for (int i = tipoHechizo1; i <= tipoHechizo3; i++) { */

        System.out.println("    1 -Hechizos de Ataque: ");
        List<Hechizo> deAtaque = buscarDeAtaque();

        for (Hechizo a : deAtaque) {
            System.out.println(a.identificador + " " + a.nombre);
        }

        System.out.println("    2- Hechizos de curacion: ");
        List<Hechizo> deCuracion = buscarDeCuracion();
        for (Hechizo a : deCuracion) {
            System.out.println(a.identificador + " " + a.nombre);
        }

        System.out.println("    3- Hechizos de defensa: ");
        List<Hechizo> deDefensa = buscarDeDefensa();
        for (Hechizo a : deDefensa) {
            System.out.println(a.identificador + " " + a.nombre);
        }

        System.out.println("    4- Hechizos de Ocio: ");
        List<Hechizo> deOcio = buscarDeOcio();
        for (Hechizo a : deOcio) {
            System.out.println(a.identificador + " " + a.nombre);
        }
    }

    public void elegirTipoHechizo(int numero) {

        /* for (int i = tipoHechizo1; i <= tipoHechizo3; i++) { */

        switch (numero) {
        case 1:
            System.out.println("Indica el número de tu Hechizo de Ataque");
            List<Hechizo> deAtaque = buscarDeAtaque();

            for (Hechizo a : deAtaque) {
                System.out.println(a.identificador + " " + a.nombre);
            }

            break;

        case 2:
            System.out.println("Indica el número de tu Hechizo de Curación");
            List<Hechizo> deCuracion = buscarDeCuracion();
            for (Hechizo a : deCuracion) {
                System.out.println(a.identificador + " " + a.nombre);
            }
            break;

        case 3:
            System.out.println("Indica el número de tu Hechizo de Defensa");
            List<Hechizo> deDefensa = buscarDeDefensa();
            for (Hechizo a : deDefensa) {
                System.out.println(a.identificador + " " + a.nombre);
            }

            break;

        case 4:
            System.out.println("Indica el número de tu Hechizo de Ocio");
            List<Hechizo> deOcio = buscarDeOcio();
            for (Hechizo a : deOcio) {
                System.out.println(a.identificador + " " + a.nombre);
            }
            break;

        default:
            break;
        }
    }
    // }

    public Hechizo getHechizoEscogido(int numero) {
        for (Hechizo h : hechizos) {
            if(numero == h.identificador){
                return h;
            }
            
        }return null;
    }

    public List<Hechizo> buscarDeAtaque() {
        List<Hechizo> deAtaque = new ArrayList<>();

        for (Hechizo a : hechizos) {
            if (a instanceof HechizoAtaque) {
                deAtaque.add(a);
            }

        }
        return deAtaque;
    }

    public List<Hechizo> buscarDeCuracion() {
        List<Hechizo> deCuracion = new ArrayList<>();

        for (Hechizo a : hechizos) {
            if (a instanceof HechizoCuracion) {
                deCuracion.add(a);
            }

        }
        return deCuracion;
    }

    public List<Hechizo> buscarDeDefensa() {
        List<Hechizo> deDefensa = new ArrayList<>();

        for (Hechizo a : hechizos) {
            if (a instanceof HechizoDefensa) {
                deDefensa.add(a);
            }

        }
        return deDefensa;
    }

    public List<Hechizo> buscarDeOcio() {
        List<Hechizo> deOcio = new ArrayList<>();

        for (Hechizo a : hechizos) {
            if (a instanceof HechizoOcio) {
                deOcio.add(a);
            }

        }
        return deOcio;
    }

}
