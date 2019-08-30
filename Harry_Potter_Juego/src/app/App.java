package app;

import java.util.Scanner;

import app.artefactos.Artefacto;
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

            Artefacto artefactos = new Artefacto();
            artefactos.agregarArtefacto();

            System.out.println("Ahora, vamos a escoger 3 artefactos");

            System.out.println("Estos artefactos te ayudarán a protegerte o a atacar a tu enemigo con mas potencia");

            System.out.println("Tenemos dos tipos de artefactos:");
            System.out.println("1 - Reliquias de la muerte");
            System.out.println("2- Artefactos magicos ");
            System.out.println("Indica el numero del tipo de artefacto que quieres usar: ");
            int tipoArtefacto = Teclado.nextInt();
            artefactos.escogerTipoArtefacto(tipoArtefacto);
            int numeroArtefacto = Teclado.nextInt();

            Artefacto artefactoEscogido = artefactos.escogerArtefacto(numeroArtefacto);

            System.out.println("Es hora de aprender hechizos!");

            Hechizo hechizo = new Hechizo();
            hechizo.cargarHechizos();

            System.out.println("    Tenemos 4 tipos de hechizos: 1 de Ataque 2 de Curación 3 de Defensa 4 de Ocio");
            // hechizos.mostrarHechizo();

            if (nuevoSerMagico instanceof Wizard) {
                if (Wizard.comprobarSiEsMagoOscuro()) {
                    System.out.println("El mago es oscuro");

                }

            }

            if (oponenteP instanceof IHacerMagia) {

                boolean atacaPrimeroElUno = true;

                while (nuevoP.salud > 0 && oponenteP.salud > 0) {

                    int numeroRandom1 = (int) (Math.round(Math.random() * (1 - 12) + 12));
                    IHacerMagia otroSerMagico;// = ((IHacerMagia) oponenteP);
                    Hechizo hechizoAtacante = null;//

                    IHacerMagia atacante = null;
                    Personaje enemigo;

                    if (atacaPrimeroElUno) {

                        if (nuevoP instanceof IHacerMagia) {
                            System.out.println("Elige el tipo de hechizo que quieres usar: ");

                            tipoHechizo1 = Teclado.nextInt();

                            hechizo.elegirTipoHechizo(tipoHechizo1);

                            System.out.println("Escoge el hechizo: ");

                            hechizoElegido1 = Teclado.nextInt();

                            hechizoAtacante = Hechizo.GetHechizoEscogido(hechizoElegido1);

                            atacante = ((IHacerMagia) nuevoP);
                            atacante.aprender(hechizoAtacante);

                        }
                        
                        enemigo = oponenteP;
                        System.out.println("Está atacando el usuario");

                    } else {
                        if (oponenteP instanceof IHacerMagia) {
                            atacante = ((IHacerMagia) oponenteP);
                            // hechizoAtacante = (Hechizo) ((IHacerMagia))
                        }
                        hechizoAtacante = Hechizo.GetHechizoEscogido(numeroRandom1);
                        enemigo = nuevoP;
                        System.out.println("Esta atacando la computadora");

                    }
                   
                    atacante.atacar(enemigo, hechizoAtacante);
                    System.out.println("La salud del enemigo es: "+enemigo.salud);
                    atacaPrimeroElUno = !atacaPrimeroElUno;
                    // otroSerMagico.aprender(hechizoRandom1);

                    /*
                     * int numeroRandom2 = (int) (Math.round(Math.random() * (1 - 12) + 12));
                     * Hechizo hechizoRandom2 = hechizo2.getHechizoEscogido(numeroRandom2);
                     * otroSerMagico.aprender(hechizoRandom2);
                     */

                    /*
                     * if (hechizoAprender instanceof HechizoAtaque) {
                     * nuevoSerMagico.atacar(oponenteP, hechizoAprender);
                     * 
                     * System.out.println(nuevoP.nombre + " atacó a " + oponenteP.nombre +
                     * " con el hechizo " + hechizoAprender.nombre);
                     * 
                     * System.out.println(oponenteP.nombre + " tiene: " + oponenteP.salud +
                     * " de vida"); } else if (hechizoAprender instanceof HechizoCuracion) {
                     * 
                     * nuevoP.salud = nuevoP.salud + hechizo.nivelDeCuracion;
                     * System.out.println(nuevoP.nombre + " se curó con: " + nuevoP.salud);
                     * 
                     * }
                     */

                    /*
                     * if (oponenteP.salud > 0) {
                     * 
                     * if (hechizoRandom1 instanceof HechizoAtaque) { nuevoSerMagico.atacar(nuevoP,
                     * hechizoRandom1); System.out.println(oponenteP.nombre + " atacó a " +
                     * nuevoP.nombre + " con el hechizo " + hechizoRandom1.nombre);
                     * 
                     * } else if (hechizoRandom1 instanceof HechizoCuracion) { oponenteP.salud =
                     * oponenteP.salud + hechizo.nivelDeCuracion;
                     * System.out.println(oponenteP.nombre + " se curó con: " +
                     * hechizoRandom1.nombre); System.out.println(oponenteP.nombre +
                     * " ahora tiene: " + oponenteP.salud); }
                     * 
                     * if (nuevoP.salud <= 0) {
                     * 
                     * System.out.println(nuevoP.nombre + " tiene 0 de vida");
                     * System.out.println(nuevoP.nombre + " murió"); } else {
                     * System.out.println(nuevoP.nombre + " tiene: " + nuevoP.salud + " de vida"); }
                     * } else {
                     * 
                     * System.out.println(oponenteP.nombre + " murió"); }
                     */

                }

            }
        } else {

            System.out.println("    Tu personaje " + nuevoP.nombre + " está implorando piedad");
            System.out.println("    ...");
            System.out.println("    ...");
            System.out.println("    ...");
            System.out.println("    " + nuevoP.nombre + " murió.");

        }
    }
}