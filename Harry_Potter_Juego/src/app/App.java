package app;

import java.util.Scanner;

import app.artefactos.Artefacto;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.poderes.hechizos.Hechizo;
import app.poderes.hechizos.hechizoscuracion.HechizoCuracion;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int tipoPersonaje;

        int numeroPersonaje;

        int tipoOponente;

        int oponente;

        int tipoHechizo1;
        Personaje enemigo;

        int hechizoElegido1;

        JuegoHarryPotter.CargarPersonaje();

        System.out.println("    Tenemos 4 tipos de personajes: 1 wizards 2 Criaturas 3 Elfos 4 Muggles");

        System.out.println("    Escoge el numero del tipo de personaje que quieres: ");

        tipoPersonaje = Teclado.nextInt();

        JuegoHarryPotter.SeleccionarTipoPersonaje(tipoPersonaje);
        System.out.println("Escoge el numero de tu personaje");

        numeroPersonaje = Teclado.nextInt();

        Personaje nuevoP = JuegoHarryPotter.CrearPersonaje(numeroPersonaje);

        System.out.println("    Escoge el tipo de oponente: ");
        System.out.println(" 1 wizards 2 Criaturas 3 Elfos 4 Muggles");

        tipoOponente = Teclado.nextInt();

        JuegoHarryPotter.SeleccionarTipoPersonaje(tipoOponente);

        System.out.println("    Escoge el numero de tu oponente");

        oponente = Teclado.nextInt();

        Personaje oponenteP = JuegoHarryPotter.CrearPersonaje(oponente);

        System.out.println("    Tu oponente es: " + oponenteP.nombre);

        if (nuevoP instanceof IHacerMagia) {

            IHacerMagia nuevoSerMagico = ((IHacerMagia) nuevoP);

            JuegoHarryPotter.CargarArtefacto();
            System.out.println("Ahora, vamos a escoger 1 artefacto mágico");

            System.out.println("Este artefacto te ayudará a protegerte o a atacar a tu enemigo con mas potencia");

            JuegoHarryPotter.MostrarArtefactos();

            System.out.println("Elige el numero del artefacto que deseas");

            int numeroArtefacto = Teclado.nextInt();

            Artefacto artefactoEscogido = JuegoHarryPotter.EscogerArtefacto(numeroArtefacto);

            nuevoSerMagico.getArtefactos().add(artefactoEscogido);
            System.out.println("El artefacto que escogiste fue: " + artefactoEscogido.nombre);

            JuegoHarryPotter.CargarHechizos();

            if (oponenteP instanceof IHacerMagia) {

                System.out.println("¡ QUE EMPIECE LA BATALLA !");

                boolean atacaPrimeroElUno = true;

                while (nuevoP.salud > 0 && oponenteP.salud > 0) {

                    int numeroRandom1 = (int) (Math.round(Math.random() * (1 - 3) + 3));
                    IHacerMagia otroSerMagico;// = ((IHacerMagia) oponenteP);
                    Hechizo hechizoAtacante = null;//

                    IHacerMagia atacante = null;

                    if (atacaPrimeroElUno) {

                        if (nuevoP instanceof IHacerMagia) {
                            System.out.println("Elige el tipo de hechizo que quieres usar: ");
                            System.out.println(
                                    " 1 - Hechizo de Ataque\n 2 - Hechizo de Curacion \n 3 - Hechizo de Defensa \n 4 - Hechizo de Ocio ");

                            tipoHechizo1 = Teclado.nextInt();

                            JuegoHarryPotter.ElegirTipoHechizo(tipoHechizo1);

                            System.out.println("Escoge el hechizo: ");

                            hechizoElegido1 = Teclado.nextInt();

                            hechizoAtacante = JuegoHarryPotter.GetHechizoEscogido(hechizoElegido1);

                            atacante = (IHacerMagia) nuevoP;

                            atacante.aprender(hechizoAtacante);

                        }

                        enemigo = oponenteP;

                        if (hechizoAtacante instanceof HechizoCuracion) {

                            JuegoHarryPotter.Curarme(nuevoP, hechizoAtacante);

                            System.out.println(
                                    nuevoP.nombre + " se está curando con el hechizo: " + hechizoAtacante.nombre);
                        } else {
                            System.out.println(nuevoP.nombre + " está atacando a " + oponenteP.nombre
                                    + " con el hechizo: " + hechizoAtacante.nombre);
                        }

                    } else {

                        atacante = (IHacerMagia) oponenteP;

                        hechizoAtacante = JuegoHarryPotter.GetHechizoEscogido(numeroRandom1);

                        enemigo = nuevoP;

                        System.out.println(oponenteP.nombre + " está atacando a  " + nuevoP.nombre + " con el hechizo: "
                                + hechizoAtacante.nombre);

                    }

                    atacante.atacar(enemigo, hechizoAtacante);

                    if (enemigo.salud < 0) {
                        enemigo.salud = 0;
                    }
                    if (enemigo.nombre.equals(nuevoP.nombre)) {
                        System.out.println("La salud de " + nuevoP.nombre + " es: " + nuevoP.salud);
                    } else {
                        System.out.println("La salud de " + oponenteP.nombre + " es: " + oponenteP.salud);

                    }

                    atacaPrimeroElUno = !atacaPrimeroElUno;
                }

            } else {
                System.out
                        .println(oponenteP.nombre + " no puede usar magia y esta siendo atacado por: " + nuevoP.nombre);
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