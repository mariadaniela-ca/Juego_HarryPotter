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


    }

    public void escogerJugador(){
        System.out.println("Escoger numero de jugador");
        for (Wizard w : this.wizards) {
            System.out.println(w.numeroPersonajeSeleccionado + " " + w.nombre);
            
        }
        int n;
        n = Teclado.nextInt();

        switch (n) {
            case 1:
            System.out.println("Tu personaje es: " );
                
                break;
        
            default:
                break;
        }

        



    }

}