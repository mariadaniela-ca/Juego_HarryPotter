package app;

import java.util.Scanner;

import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.personajes.Wizard;
import app.poderes.hechizos.Hechizo;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(Math.round(Math.random() * (1 - 10) + 10));
        System.out.println(Math.round(Math.random() * (1 - 4) + 4));
        /*
         * int numeroJugador; int oponente; int numeroArtefacto;
         */ int tipoPersonaje;
        int numeroPersonaje;
        int tipoOponente;
        int oponente;
        int tipoHechizo1;
        int tipoHechizo2;
        int tipoHechizo3;

        int hechizoElegido1;
        int hechizoElegido2;
        int hechizoElegido3;

        JuegoHarryPotter juegoNuevo = new JuegoHarryPotter();

        juegoNuevo.cargarPersonaje();

        System.out.println("    Tenemos 4 tipos de personajes: 1 wizards 2 Criaturas 3 Elfos 4 Muggles");

        System.out.println("    Escoge el numero del tipo de personaje que quieres: ");

        tipoPersonaje = Teclado.nextInt();

        juegoNuevo.seleccionarTipoPersonaje(tipoPersonaje);
        System.out.println("Escoge el numero de tu personaje");

        numeroPersonaje = Teclado.nextInt();

        Personaje nuevoP = juegoNuevo.crearPersonaje(numeroPersonaje);

        System.out.println("    Escoge el tipo de oponente: ");
        System.out.println(" 1 wizards 2 Criaturas 3 Elfos 4 Muggles");

        tipoOponente = Teclado.nextInt();

        juegoNuevo.seleccionarTipoPersonaje(tipoOponente);

        System.out.println("    Escoge el numero de tu oponente");

        oponente = Teclado.nextInt();

        Personaje oponenteP = juegoNuevo.crearPersonaje(oponente);

        System.out.println("    Tu oponente es: " + oponenteP.nombre);

        if (nuevoP instanceof IHacerMagia) {

            IHacerMagia nuevoSerMagico = ((IHacerMagia) nuevoP);

            System.out.println("Es hora de aprender hechizos!");
            Hechizo hechizo = new Hechizo();
            hechizo.cargarHechizos();

            System.out.println("    Tenemos 4 tipos de hechizos: 1 de Ataque 2 de Curación 3 de Defensa 4 de Ocio");
            // hechizos.mostrarHechizo();

            System.out.println("Elige tu primer tipo de hechizo: ");
            tipoHechizo1 = Teclado.nextInt();
            hechizo.elegirTipoHechizo(tipoHechizo1);

            System.out.println("Escoge el hechizo: ");
            hechizoElegido1 = Teclado.nextInt();

            Hechizo hechizoAprender1 = hechizo.getHechizoEscogido(hechizoElegido1);
            nuevoSerMagico.aprender(hechizoAprender1);

            Hechizo hechizo2 = new Hechizo();

            System.out.println("Elige tu segundo tipo de hechizo: ");
            System.out.println("1 de Ataque, 2 de Curación, 3 de Defensa ó 4 de Ocio");
            tipoHechizo2 = Teclado.nextInt();
            hechizo2.elegirTipoHechizo(tipoHechizo2);

            System.out.println("Escoge el hechizo: ");
            hechizoElegido2 = Teclado.nextInt();
            Hechizo hechizoAprender2 = hechizo.getHechizoEscogido(hechizoElegido2);
            nuevoSerMagico.aprender(hechizoAprender2);

            Hechizo hechizo3 = new Hechizo();

            System.out.println("Elige tu último tipo de hechizo: ");
            System.out.println("Recuerda que los tipos son: 1 de Ataque, 2 de Curación, 3 de Defensa y 4 de Ocio");
            tipoHechizo3 = Teclado.nextInt();
            hechizo3.elegirTipoHechizo(tipoHechizo3);

            System.out.println("Escoge el hechizo: ");
            hechizoElegido3 = Teclado.nextInt();
            Hechizo hechizoAprender3 = hechizo.getHechizoEscogido(hechizoElegido3);
            nuevoSerMagico.aprender(hechizoAprender3);

            if (nuevoSerMagico instanceof Wizard) {
                if (Wizard.comprobarSiEsMagoOscuro()) {
                    System.out.println("El mago es oscuro");
                }

            }

            /*
             * if (oponenteP instanceof IHacerMagia) {
             * 
             * while (nuevoP.salud > 0 && oponenteP.salud > 0) {
             * 
             * int numeroRandom1 = (int) (Math.round(Math.random() * (1 - 12) + 12));
             * IHacerMagia otroSerMagico = ((IHacerMagia) oponenteP); Hechizo hechizoRandom1
             * = hechizo.getHechizoEscogido(numeroRandom1); // este hechizo 1 no se confunde
             * con linea 65? otroSerMagico.aprender(hechizoRandom1);
             * 
             * int numeroRandom2 = (int) (Math.round(Math.random() * (1 - 12) + 12));
             * Hechizo hechizoRandom2 = hechizo2.getHechizoEscogido(numeroRandom2);
             * otroSerMagico.aprender(hechizoRandom2);
             * 
             * 
             * System.out.println(nuevoP.nombre + " ataca a " + oponenteP.nombre +
             * " con el hechizo " + hechizoAprender1.nombre);
             * 
             * nuevoSerMagico.atacar(oponenteP, hechizoAprender1);
             * 
             * System.out.println(oponenteP.nombre + " tiene: " + oponenteP.salud +
             * " de vida");
             * 
             * if (oponenteP.salud > 0) {
             * 
             * System.out.println(oponenteP.nombre + " ataca a " + nuevoP.nombre +
             * " con el hechizo: " + hechizoRandom1.nombre);
             * 
             * otroSerMagico.atacar(nuevoP, hechizoRandom1);
             * 
             * if (nuevoP.salud <= 0) {
             * 
             * System.out.println(nuevoP.nombre + " tiene 0 de vida");
             * System.out.println(nuevoP.nombre + " murió"); } else {
             * System.out.println(nuevoP.nombre + " tiene: " + nuevoP.salud + " de vida"); }
             * } else { System.out.println(oponenteP.nombre + " tiene 0 de vida");
             * System.out.println(oponenteP.nombre + " murió"); }
             * 
             * }
             * 
             * }
             * 
             * /* for (int i = 0; i < 3; i++) { Hechizo hh = new Hechizo();
             * hh.mostrarHechizo();
             * 
             * }
             */

            /*
             * System.out.println(" Escoge que tipo de hechizos quieres (solo puedes 3)");
             * 
             * int tipoHechizo1; tipoHechizo1 = Teclado.nextInt();
             * hechizos.elegirTipoHechizo(tipoHechizo1); int hechizoElegido1;
             * hechizoElegido1 = Teclado.nextInt(); hechizos.elegirHechizo(hechizoElegido1);
             * 
             * System.out.println("Escoge tu segundo tipo de hechizo: ");
             * 
             * int tipoHechizo2; tipoHechizo2 = Teclado.nextInt();
             * hechizos.elegirTipoHechizo(tipoHechizo2); int hechizoElegido2;
             * hechizoElegido2 = Teclado.nextInt(); hechizos.elegirHechizo(hechizoElegido2);
             * 
             * System.out.println("Solo un tipo más!");
             * 
             * int tipoHechizo3; tipoHechizo3 = Teclado.nextInt();
             * hechizos.elegirTipoHechizo(tipoHechizo3); int hechizoElegido3;
             * hechizoElegido3 = Teclado.nextInt(); hechizos.elegirHechizo(hechizoElegido3);
             * 
             * System.out.println("Tu personaje es " + nuevoP.nombre +
             * " y sus hechizos serán " + hechizoElegido1 + ", " + hechizoElegido2 + ", " +
             * hechizoElegido3);
             * 
             * // hechizos.buscarDeAtaque();
             * 
             * IHacerMagia nuevoSerMagico = ((IHacerMagia)nuevoP);
             * System.out.println("Es hora de aprender hechizos!");
             * nuevoSerMagico.aprender(h);
             * 
             */
            // for (int i = nuevoP.salud; i >= 0; i--) {}

            else {

                System.out.println("    Tu personaje " + nuevoP.nombre + " está implorando piedad");
                System.out.println("    ...");
                System.out.println("    ...");
                System.out.println("    ...");
                System.out.println("    " + nuevoP.nombre + " murió.");

            }

        }

    }
}