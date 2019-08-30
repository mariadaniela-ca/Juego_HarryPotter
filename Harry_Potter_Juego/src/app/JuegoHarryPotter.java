package app;

import java.util.ArrayList;
import java.util.List;

import app.personajes.Criatura;
import app.personajes.Muggle;
import app.personajes.Personaje;
import app.personajes.Wizard;

/**
 * JuegoHarryPotter
 */

public class JuegoHarryPotter {

    
    public List<Personaje> personajes = new ArrayList<Personaje>();

    public void cargarPersonaje() {

        Wizard personaje = new Wizard("Harry Potter");
        personaje.edad = 17;
        personaje.numeroPersonajeSeleccionado = 1;
        personajes.add(personaje);

        personaje = new Wizard("Hermione Granger");
        personaje.edad = 17;
        personaje.numeroPersonajeSeleccionado = 2;
        personajes.add(personaje);

        personaje = new Wizard("Ron Weasley");
        personaje.edad = 17;
        personaje.numeroPersonajeSeleccionado = 3;
        personajes.add(personaje);

        personaje = new Wizard("Bellatrix Lestrange");
        personaje.edad = 47;
        personaje.numeroPersonajeSeleccionado = 4;
        personajes.add(personaje);

        Criatura criatura = new Criatura("Acromántula");
        criatura.nivelDeDaño = 80;
        criatura.numeroPersonajeSeleccionado = 5;
        personajes.add(criatura);

        criatura = new Criatura("Basilisco");
        criatura.nivelDeDaño = 80;
        criatura.numeroPersonajeSeleccionado = 6;
        personajes.add(criatura);

        /*
         * Elfo elfo = new Elfo("Dobby"); elfo.nivelDeDaño = 50;
         * elfo.numeroPersonajeSeleccionado = 7; personajes.add(elfo);
         * 
         * elfo = new Elfo("Kreacher"); elfo.nivelDeDaño = 40;
         * elfo.numeroPersonajeSeleccionado = 8; personajes.add(criatura);
         */

        Muggle muggle = new Muggle("Vernon Dursley");
        muggle.edad = 46;
        muggle.numeroPersonajeSeleccionado = 9;
        personajes.add(muggle);

        muggle = new Muggle("Sra Granger");
        muggle.edad = 52;
        muggle.numeroPersonajeSeleccionado = 10;
        personajes.add(muggle);

    }

    public void seleccionarTipoPersonaje(int n) {

        switch (n) {
        case 1:

            System.out.println("Escogiste un Wizard! ");
            List<Wizard> listaWizards = buscarWizard();
            for (Wizard w : listaWizards) {
                System.out.println(w.numeroPersonajeSeleccionado + " " + w.nombre);
            }
            
            break;

        case 2:

            System.out.println("Escogiste una Criatura! ");
            List<Criatura> listaCriaturas = buscarCriatura();
            for (Criatura c : listaCriaturas) {
                System.out.println(c.numeroPersonajeSeleccionado + " " + c.nombre);
            }
            break;

        /*
         * case 3:
         * 
         * System.out.println("indica el número de tu Elfo: "); List<Elfo> listaElfos =
         * buscarElfo(); for (Elfo e : listaElfos) {
         * System.out.println(e.numeroPersonajeSeleccionado + " " + e.nombre);
         * 
         * } break;
         */

        case 4:
            System.out.println("Escogiste un Muggle! ");
            List<Muggle> listaMuggles = buscarMuggle();
            for (Muggle m : listaMuggles) {
                System.out.println(m.numeroPersonajeSeleccionado + " " + m.nombre);
            }
            break;

        default:
            break;
        }

    }

    /*
     * public List<Ataque> buscarHechizoAtaque(){ List<Ataque> listaAtaque = new
     * ArrayList<>(); for (Hechizo h : hechizos) { if (h instanceof Ataque){
     * listaAtaque.add(h); }
     * 
     * } }
     */

    public List<Wizard> buscarWizard() {
        List<Wizard> listaWizards = new ArrayList<>();

        for (Personaje p : personajes) {
            if (p instanceof Wizard) {
                listaWizards.add((Wizard) p); // Lo casteo para que devuelva un listado de Wizards, porque Personaje no
                                              // es un Wizard
            }
        }

        return listaWizards;
    }

    public List<Criatura> buscarCriatura() {
        List<Criatura> listaCriaturas = new ArrayList<>();

        for (Personaje p : personajes) {
            if (p instanceof Criatura) {
                listaCriaturas.add((Criatura) p);
            }
        }
        return listaCriaturas;
    }

    /*
     * public List<Elfo> buscarElfo() { List<Elfo> listaElfos = new ArrayList<>();
     * 
     * for (Personaje p : personajes) { if (p instanceof Elfo) {
     * listaElfos.add((Elfo) p); } } return listaElfos; }
     */
    public List<Muggle> buscarMuggle() {
        List<Muggle> listaMuggles = new ArrayList<>();

        for (Personaje p : personajes) {
            if (p instanceof Muggle) {
                listaMuggles.add((Muggle) p);
            }
        }
        return listaMuggles;
    }


    public Personaje crearPersonaje(int n) {
        for (Personaje v : personajes) {
            if(n == v.numeroPersonajeSeleccionado){
                return v;
            }            
        }return null;

    }
}
    
   
