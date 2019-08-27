package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.personajes.Wizard;

/**
 * JuegoHarryPotter
 * 
 * @param <Hechizo>
 */
public class JuegoHarryPotter {

    public static String jugador;
    public Scanner Teclado = new Scanner(System.in);

    public List<Wizard> wizards = new ArrayList<Wizard>();

    public void cargarPersonajes() {

        Wizard personaje = new Wizard("Harry Potter");
        personaje.edad = 17;
        personaje.esMagoOscuro = false;
        personaje.numeroPersonajeSeleccionado = 1;
        wizards.add(personaje);

        personaje = new Wizard("Ron Weasley");
        personaje.edad = 17;
        personaje.esMagoOscuro = false;
        personaje.numeroPersonajeSeleccionado = 2;
        wizards.add(personaje);

        personaje = new Wizard("Hermione Granger");
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

    public void escogerJugador() {
        System.out.println("Los personajes son:");
        for (Wizard w : wizards) {
            System.out.println(w.numeroPersonajeSeleccionado + " " + w.nombre);
        }
        System.out.println("Elije el número de tu personaje:");

        int numero;
        numero = Teclado.nextInt();

        switch (numero) {
        case 1:
           
            jugador = "Harry Potter";
            break;

        case 2:
            
            jugador = "Ron Weasley";
            break;
        case 3:
            
            jugador = "Hermione Granger";
            break;
        case 4:
           
            jugador = "Bellatrix Lestrange";
            break;
        default:
            break;
        }

    }

}
