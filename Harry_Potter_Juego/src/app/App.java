package app;

import java.util.Scanner;

import app.artefactos.Artefacto;
import app.personajes.Wizard;


public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numeroJugador;
        int oponente;
        int numeroArtefacto;

        JuegoHarryPotter juegoNuevo = new JuegoHarryPotter();

        juegoNuevo.cargarJugadores();

        System.out.println("Escoge tu jugador");

        juegoNuevo.mostrarPersonajes();

        numeroJugador = Teclado.nextInt();

        Wizard nuevoJugador = juegoNuevo.seleccionarJugador(numeroJugador);

        System.out.println(nuevoJugador.nombre + " " + nuevoJugador.salud);

        System.out.println("Escoge a tu oponente");
        oponente = Teclado.nextInt();

        Wizard otroWizard = juegoNuevo.seleccionarJugador(oponente);

        System.out.println("Tu oponente es: " + otroWizard.nombre);

        System.out.println("Escoge un artefacto mágico: ");

        Artefacto nuevos = new Artefacto();
        nuevos.agregarReliquia();

        nuevos.mostrarArtefactos();
        numeroArtefacto = Teclado.nextInt();

        Artefacto otro = nuevos.escogerArtefacto(numeroArtefacto);

        System.out.println("Escogiste: " + otro.nombre);

        for (int i = nuevoJugador.salud; i >= 0; i--) {

            nuevoJugador.salud = nuevoJugador.salud - otro.amplificadorDeDaño;
            nuevoJugador.salud = nuevoJugador.salud + 2;
            i = nuevoJugador.salud;
            System.out.println(i);
        }

        System.out.println("MORISTE! ADIOS! ");
    }
}