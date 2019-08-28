package app;

import java.util.Scanner;

import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.poderes.hechizos.Hechizo;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * int numeroJugador; int oponente; int numeroArtefacto;
         */ int tipoPersonaje;
        int numeroPersonaje;
        int tipoOponente;
        int oponente;

        JuegoHarryPotter juegoNuevo = new JuegoHarryPotter();

        juegoNuevo.cargarPersonaje();

        System.out.println("    Tenemos 4 tipos de personajes: 1 wizards 2 Criaturas 3 Elfos 4 Muggles");

        System.out.println("    Escoge el numero del tipo personaje: ");

        tipoPersonaje = Teclado.nextInt();

        juegoNuevo.seleccionarTipoPersonaje(tipoPersonaje);

        System.out.println("    Escoge el numero de tu personaje");

        numeroPersonaje = Teclado.nextInt();

        Personaje nuevoP = juegoNuevo.crearPersonaje(numeroPersonaje);

        System.out.println("    Escoge el tipo de oponente: ");

        tipoOponente = Teclado.nextInt();

        juegoNuevo.seleccionarTipoPersonaje(tipoOponente);

        System.out.println("    Escoge el numero de tu oponente");

        oponente = Teclado.nextInt();

        Personaje oponenteP = juegoNuevo.crearPersonaje(oponente);

        System.out.println("    Tu oponente es: " + oponenteP.nombre);

        Hechizo hechizos = new Hechizo();
        hechizos.cargarHechizos();






        if (nuevoP instanceof IHacerMagia) {

            IHacerMagia nuevoSerMagico = ((IHacerMagia)nuevoP);
            System.out.println("Es hora de aprender hechizos!");
                   
            
            // for (int i = nuevoP.salud; i >= 0; i--) {}

        } else {

            System.out.println("    Tu personaje " + nuevoP.nombre + " está implorando piedad");
            System.out.println("    ...");
            System.out.println("    ...");
            System.out.println("    ...");
            System.out.println("    " + nuevoP.nombre + " murió.");

        }

    }

}