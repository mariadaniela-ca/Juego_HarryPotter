package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.personajes.Wizard;

/**
 * JuegoHarryPotter
 */


public class JuegoHarryPotter {

    public Scanner Teclado = new Scanner(System.in);
    
    public List<Wizard> wizards = new ArrayList<Wizard>();

    public void cargarJugadores() {
        Wizard personaje = new Wizard("Harry Potter");

        personaje.edad = 17;
        personaje.esMagoOscuro = false;
        personaje.numeroPersonajeSeleccionado = 1;

        wizards.add(personaje);

        personaje = new Wizard("Hermione Granger");
        personaje.edad = 17;
        personaje.esMagoOscuro = false;
        personaje.numeroPersonajeSeleccionado = 2;


        wizards.add(personaje);

        personaje = new Wizard("Ron Weasley");
        personaje.edad = 17;
        personaje.esMagoOscuro = false;
        personaje.numeroPersonajeSeleccionado = 3;

        wizards.add(personaje);

        personaje = new Wizard("Bellatrix Lestrange");
        personaje.edad = 47;
        personaje.esMagoOscuro = true;
        personaje.numeroPersonajeSeleccionado = 4;
        wizards.add(personaje);

    }

    public void mostrarPersonajes() {
        for (Wizard w : wizards) {
            System.out.println(w.numeroPersonajeSeleccionado + " " + w.nombre);

        }
    }

    public Wizard seleccionarJugador(int numero) {

        for (Wizard v : wizards) {

            if (numero == v.numeroPersonajeSeleccionado) {
                return v;
            }

        }
        return null;
    }
    

}
