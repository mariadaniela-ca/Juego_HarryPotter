package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.personajes.Wizard;
import app.poderes.hechizos.Hechizo;

/**
 * JuegoHarryPotter
 * 
 * @param <Hechizo>
 */
public class JuegoHarryPotter {
    
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
        personaje.edad= 47;
        personaje.esMagoOscuro= true;
        personaje.numeroPersonajeSeleccionado= 4;
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
            System.out.println("Su jugador es Harry Potter");
            
            break;

        case 2:
            System.out.println("Su jugador es Ron");
            
            break;
        case 3:
            System.out.println("Su jugador es Hermione");
            
            break;

        default:
            break;
        }
    }

    public Hechizo buscarHechizo(int numero) {
        for (Hechizo h : Hechizo.hechizos) {
            if (numero==h.numeroHechizo){
                return h;
            }
        }
        return null;
    }

    public Wizard buscarPersonaje(int numero){
        for (Wizard w : wizards){
            if (numero  == w.numero){
                return w;
            }
        }
        return null;
    }

    public void escogerHechizos() {
        System.out.println("Los hechizos son:");
        for (Hechizo h: Hechizo.hechizos){
            System.out.println(h.numeroHechizo+ " "+h.nombre);
            }
        System.out.println("Indica en números qué hechizos quieres (Solo puedes 3)");

        int numero;
        for (int i = 0; i < 3; i++) {
            numero = Teclado.nextInt();

            Hechizo hechizoSeleccionado = buscarHechizo(numero);
            if(hechizoSeleccionado != null)
            {
                
            }
            else{
                System.out.println("Ingrese un número válido");
            }



               
        }






    }
}
