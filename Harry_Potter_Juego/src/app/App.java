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

        numeroPersonaje = Teclado.nextInt();

        Personaje nuevoP = juegoNuevo.crearPersonaje(numeroPersonaje);

        System.out.println("    Escoge el tipo de oponente: ");

        tipoOponente = Teclado.nextInt();

        juegoNuevo.seleccionarTipoPersonaje(tipoOponente);

        System.out.println("    Escoge el numero de tu oponente");

        oponente = Teclado.nextInt();

        Personaje oponenteP = juegoNuevo.crearPersonaje(oponente);

        System.out.println("    Tu oponente es: " + oponenteP.nombre);

        if (nuevoP instanceof IHacerMagia) {

            IHacerMagia nuevoSerMagico = ((IHacerMagia) nuevoP);

            System.out.println("Es hora de aprender hechizos!");
            Hechizo hechizos = new Hechizo();
            hechizos.cargarHechizos();

            System.out.println("    Tenemos 4 tipos de hechizos: 1 de Ataque 2 de Curación 3 de Defensa 4 de Ocio");
            System.out.println(" Escoge que tipo de hechizos quieres (solo puedes 3)");

            int tipoHechizo1;
            tipoHechizo1 = Teclado.nextInt();
            hechizos.elegirTipoHechizo(tipoHechizo1);
            int hechizoElegido1;
            hechizoElegido1 = Teclado.nextInt();
            hechizos.elegirHechizo(hechizoElegido1);

            System.out.println("Escoge tu segundo tipo de hechizo: ");

            int tipoHechizo2;
            tipoHechizo2 = Teclado.nextInt();
            hechizos.elegirTipoHechizo(tipoHechizo2);
            int hechizoElegido2;
            hechizoElegido2 = Teclado.nextInt();
            hechizos.elegirHechizo(hechizoElegido2);

            System.out.println("Solo un tipo más!");

            int tipoHechizo3;
            tipoHechizo3 = Teclado.nextInt();
            hechizos.elegirTipoHechizo(tipoHechizo3);
            int hechizoElegido3;
            hechizoElegido3 = Teclado.nextInt();
            hechizos.elegirHechizo(hechizoElegido3);

            System.out.println("Tu personaje es " + nuevoP.nombre + " y sus hechizos serán " + hechizoElegido1 + ", "
                    + hechizoElegido2 + ", " + hechizoElegido3);

            // hechizos.buscarDeAtaque();

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