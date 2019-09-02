package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.artefactos.CapaDeInvisibilidad;
import app.artefactos.Horrocrux;
import app.artefactos.PiedraDeResurreccion;
import app.artefactos.VaritaDeSauco;
import app.interfaces.IReliquiaMuerte;
import app.personajes.Criatura;
import app.personajes.Elfo;
import app.personajes.Muggle;
import app.personajes.Personaje;
import app.personajes.Wizard;
import app.poderes.hechizos.Hechizo;
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
 * JuegoHarryPotter
 */

public class JuegoHarryPotter {

    public static List<Artefacto> Artefactos = new ArrayList<Artefacto>();

    public static List<Personaje> Personajes = new ArrayList<Personaje>();

    public static List<Hechizo> Hechizos = new ArrayList<Hechizo>();

    public static void CargarPersonaje() {

        

        Wizard personaje = new Wizard("Harry Potter");
        personaje.edad = 17;
        personaje.numeroPersonajeSeleccionado = 1;
        personaje.salud = 100;
        personaje.energiaMagica = 100;
        Personajes.add(personaje);

        personaje = new Wizard("Hermione Granger");
        personaje.edad = 17;
        personaje.salud = 100;
        personaje.energiaMagica = 100;
        personaje.numeroPersonajeSeleccionado = 2;

        Personajes.add(personaje);

        personaje = new Wizard("Ron Weasley");
        personaje.edad = 17;
        personaje.salud = 100;
        personaje.energiaMagica = 100;
        personaje.numeroPersonajeSeleccionado = 3;
        Personajes.add(personaje);

        personaje = new Wizard("Bellatrix Lestrange");
        personaje.edad = 47;
        personaje.salud = 100;
        personaje.energiaMagica = 120;
        personaje.numeroPersonajeSeleccionado = 4;
        Personajes.add(personaje);

        Criatura criatura = new Criatura("Acromántula");
        criatura.nivelDeDaño = 80;
        criatura.salud = 100;
        criatura.energiaMagica = 0;
        criatura.numeroPersonajeSeleccionado = 5;
        Personajes.add(criatura);

        criatura = new Criatura("Basilisco");
        criatura.nivelDeDaño = 80;
        criatura.salud = 100;
        criatura.energiaMagica = 0;
        criatura.numeroPersonajeSeleccionado = 6;
        Personajes.add(criatura);

        Elfo elfo = new Elfo("Dobby");
        elfo.nivelDeDaño = 50;
        elfo.salud = 100;
        elfo.energiaMagica = 100;
        elfo.numeroPersonajeSeleccionado = 7;
        Personajes.add(elfo);

        elfo = new Elfo("Kreacher");
        elfo.nivelDeDaño = 40;
        elfo.salud = 100;
        elfo.energiaMagica = 100;
        elfo.numeroPersonajeSeleccionado = 8;
        Personajes.add(elfo);

        Muggle muggle = new Muggle("Vernon Dursley");
        muggle.edad = 46;
        muggle.salud = 100;
        muggle.energiaMagica = 0;
        muggle.numeroPersonajeSeleccionado = 9;
        Personajes.add(muggle);

        muggle = new Muggle("Sra Granger");
        muggle.edad = 52;
        muggle.salud = 100;
        muggle.energiaMagica = 0;
        muggle.numeroPersonajeSeleccionado = 10;
        Personajes.add(muggle);

    }

    public static void CargarHechizos() {

        Cruciatus c = new Cruciatus("Cruciatus");
        c.identificador = 1;
        c.esOscuro = true;
        c.nivelDeCuracion = 0;
        c.nivelDeDaño = 50;
        c.nivelDeProteccion = 0;
        c.nivelDeEnergia = 40;

        Hechizos.add(c);

        PetrificusTotalus p = new PetrificusTotalus("Petrificus Totalus");
        p.identificador = 2;
        p.esOscuro = false;
        p.nivelDeCuracion = 0;
        p.nivelDeDaño = 20;
        p.nivelDeProteccion = 0;
        p.nivelDeEnergia = 20;

        Hechizos.add(p);

        Sectumsempra s = new Sectumsempra("Sectumsempra");
        s.identificador = 3;
        s.esOscuro = false;
        s.nivelDeCuracion = 0;
        s.nivelDeDaño = 15;
        s.nivelDeProteccion = 0;
        s.nivelDeEnergia = 10;

        Hechizos.add(s);

        BrackiumEmendo b = new BrackiumEmendo("Brackium Emendo");
        b.identificador = 4;
        b.esOscuro = false;
        b.nivelDeCuracion = 20;
        b.nivelDeDaño = 0;
        b.nivelDeProteccion = 0;
        b.nivelDeEnergia = 10;
        Hechizos.add(b);

        Reparifors r = new Reparifors("Reparifors");
        r.identificador = 5;
        r.esOscuro = false;
        r.nivelDeCuracion = 25;
        r.nivelDeDaño = 0;
        r.nivelDeProteccion = 0;
        r.nivelDeEnergia = 10;
        Hechizos.add(r);

        VulneraSanentur v = new VulneraSanentur("Vulnera Sanentur");
        v.identificador = 6;
        v.esOscuro = false;
        v.nivelDeCuracion = 20;
        v.nivelDeDaño = 0;
        v.nivelDeProteccion = 0;
        v.nivelDeEnergia = 10;
        Hechizos.add(v);

        CaveInimicum ci = new CaveInimicum("Cave Inimicum");
        ci.identificador = 7;
        ci.esOscuro = false;
        ci.nivelDeCuracion = 0;
        ci.nivelDeDaño = 0;
        ci.nivelDeProteccion = 5;
        ci.nivelDeEnergia = 20;
        Hechizos.add(ci);

        ExpectoPatronum e = new ExpectoPatronum("Expecto Patronum");
        e.identificador = 8;
        e.esOscuro = false;
        e.nivelDeCuracion = 0;
        e.nivelDeDaño = 0;
        e.nivelDeProteccion = 10;
        e.nivelDeEnergia = 25;
        Hechizos.add(e);

        Protego pr = new Protego("Protego");
        pr.identificador = 9;
        pr.esOscuro = false;
        pr.nivelDeCuracion = 0;
        pr.nivelDeDaño = 0;
        pr.nivelDeProteccion = 15;
        pr.nivelDeEnergia = 20;
        Hechizos.add(pr);

        Accio acc = new Accio("Accio");
        acc.identificador = 10;
        acc.esOscuro = false;
        acc.nivelDeCuracion = 0;
        acc.nivelDeDaño = 0;
        acc.nivelDeProteccion = 0;
        acc.nivelDeEnergia = 15;
        Hechizos.add(acc);

        Bauleo bau = new Bauleo("Bauleo");
        bau.identificador = 11;
        bau.esOscuro = false;
        bau.nivelDeCuracion = 0;
        bau.nivelDeDaño = 0;
        bau.nivelDeProteccion = 0;
        bau.nivelDeEnergia = 15;
        Hechizos.add(bau);

        WingardiumLeviosa win = new WingardiumLeviosa("Wingardium Leviosa");
        win.identificador = 12;
        win.esOscuro = false;
        win.nivelDeCuracion = 0;
        win.nivelDeDaño = 0;
        win.nivelDeProteccion = 0;
        win.nivelDeEnergia = 15;
        Hechizos.add(win);

    }

    public static void CargarArtefacto() {

        CapaDeInvisibilidad capa = new CapaDeInvisibilidad("Capa de invisibilidad");
        capa.amplificadorDeDaño = 0;
        capa.amplificadorDeSalud = 2;
        capa.numeroDeArtefacto = 1;
        Artefactos.add(capa);

        PiedraDeResurreccion piedra = new PiedraDeResurreccion("Piedra de la resurrección");
        piedra.amplificadorDeDaño = 0;
        piedra.amplificadorDeSalud = 2;
        piedra.numeroDeArtefacto = 2;
        Artefactos.add(piedra);

        VaritaDeSauco varita = new VaritaDeSauco("Varita de Sauco");
        varita.amplificadorDeDaño = 2;
        varita.amplificadorDeSalud = 0;
        varita.numeroDeArtefacto = 3;
        Artefactos.add(varita);

        Horrocrux horrocrux = new Horrocrux("Diario de Tom Riddle");
        horrocrux.amplificadorDeDaño = 1;
        horrocrux.amplificadorDeSalud = 0;
        horrocrux.numeroDeArtefacto = 4;
        Artefactos.add(horrocrux);

    }

    public static void MostrarArtefactos() {

        for (Artefacto ar : Artefactos) {
            System.out.println(ar.numeroDeArtefacto + " " + ar.nombre);

        }

    }

    public static Artefacto EscogerArtefacto(int n) {
        for (Artefacto ar : Artefactos) {
            if (n == ar.numeroDeArtefacto) {
                return ar;
            }

        }
        return null;
    }

    public static List<Artefacto> BuscarReliquia() {
        List<Artefacto> ListaReliquias = new ArrayList<>();

        for (Artefacto r : Artefactos) {
            if (r instanceof IReliquiaMuerte) {
                ListaReliquias.add(r);

            }

        }
        return ListaReliquias;
    }

    public static List<Artefacto> BuscarArtefacto() {
        List<Artefacto> listaComunes = new ArrayList<>();

        for (Artefacto c : Artefactos) {
            if (c instanceof Artefacto) {
                listaComunes.add(c);

            }

        }
        return listaComunes;
    }

    public static void ElegirTipoHechizo(int numero) {

        switch (numero) {
        case 1:
            List<Hechizo> deAtaque = BuscarDeAtaque();
            for (Hechizo a : deAtaque) {
                System.out.println(a.identificador + " " + a.nombre);
            }

            break;

        case 2:
            List<Hechizo> deCuracion = BuscarDeCuracion();
            for (Hechizo a : deCuracion) {
                System.out.println(a.identificador + " " + a.nombre);
            }
            break;

        case 3:

            List<Hechizo> deDefensa = BuscarDeDefensa();
            for (Hechizo a : deDefensa) {
                System.out.println(a.identificador + " " + a.nombre);
            }

            break;

        case 4:

            List<Hechizo> deOcio = BuscarDeOcio();
            for (Hechizo a : deOcio) {
                System.out.println(a.identificador + " " + a.nombre);
            }
            break;

        default:
            break;
        }
    }

    public static Hechizo GetHechizoEscogido(int numero) {
        for (Hechizo h : Hechizos) {
            if (numero == h.identificador) {
                return h;
            }

        }
        return null;
    }

    public static List<Hechizo> BuscarDeAtaque() {
        List<Hechizo> deAtaque = new ArrayList<>();

        for (Hechizo a : Hechizos) {
            if (a instanceof HechizoAtaque) {
                deAtaque.add(a);
            }

        }
        return deAtaque;
    }

    public static List<Hechizo> BuscarDeCuracion() {
        List<Hechizo> deCuracion = new ArrayList<>();

        for (Hechizo a : Hechizos) {
            if (a instanceof HechizoCuracion) {
                deCuracion.add(a);
            }

        }
        return deCuracion;
    }

    public static List<Hechizo> BuscarDeDefensa() {
        List<Hechizo> deDefensa = new ArrayList<>();

        for (Hechizo a : Hechizos) {
            if (a instanceof HechizoDefensa) {
                deDefensa.add(a);
            }

        }
        return deDefensa;
    }

    public static List<Hechizo> BuscarDeOcio() {
        List<Hechizo> deOcio = new ArrayList<>();

        for (Hechizo a : Hechizos) {
            if (a instanceof HechizoOcio) {
                deOcio.add(a);
            }

        }
        return deOcio;
    }

    public static void SeleccionarTipoPersonaje(int n) {

        switch (n) {
        case 1:
            List<Wizard> listaWizards = BuscarWizard();
            for (Wizard w : listaWizards) {
                System.out.println(w.numeroPersonajeSeleccionado + " " + w.nombre);
            }

            break;

        case 2:

            List<Criatura> listaCriaturas = BuscarCriatura();
            for (Criatura c : listaCriaturas) {
                System.out.println(c.numeroPersonajeSeleccionado + " " + c.nombre);
            }
            break;

        case 3:

            List<Elfo> listaElfos = buscarElfo();
            for (Elfo e : listaElfos) {
                System.out.println(e.numeroPersonajeSeleccionado + " " + e.nombre);

            }
            break;

        case 4:
            List<Muggle> listaMuggles = BuscarMuggle();
            for (Muggle m : listaMuggles) {
                System.out.println(m.numeroPersonajeSeleccionado + " " + m.nombre);
            }
            break;

        default:
            break;
        }

    }

    public static List<Wizard> BuscarWizard() {
        List<Wizard> listaWizards = new ArrayList<>();

        for (Personaje p : Personajes) {
            if (p instanceof Wizard) {
                listaWizards.add((Wizard) p); // Lo casteo para que devuelva un listado de Wizards, porque Personaje no
                                              // es un Wizard
            }
        }

        return listaWizards;
    }

    public static List<Criatura> BuscarCriatura() {
        List<Criatura> listaCriaturas = new ArrayList<>();

        for (Personaje p : Personajes) {
            if (p instanceof Criatura) {
                listaCriaturas.add((Criatura) p);
            }
        }
        return listaCriaturas;
    }

    public static List<Elfo> buscarElfo() {
        List<Elfo> listaElfos = new ArrayList<>();

        for (Personaje p : Personajes) {
            if (p instanceof Elfo) {
                listaElfos.add((Elfo) p);
            }
        }
        return listaElfos;
    }

    public static List<Muggle> BuscarMuggle() {
        List<Muggle> listaMuggles = new ArrayList<>();

        for (Personaje p : Personajes) {
            if (p instanceof Muggle) {
                listaMuggles.add((Muggle) p);
            }
        }
        return listaMuggles;
    }

    public static Personaje CrearPersonaje(int n) {
        for (Personaje v : Personajes) {
            if (n == v.numeroPersonajeSeleccionado) {
                return v;
            }
        }
        return null;

    }
    
    public static void Curarme(Personaje p, Hechizo h) {
        if(h instanceof HechizoCuracion){
        p.salud = p.salud + h.nivelDeCuracion;
        }
    }
    
}
