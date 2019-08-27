package app.interfaces;

import java.util.Scanner;

import app.JuegoHarryPotter;
import app.poderes.hechizos.Hechizo;

/**
 * IHacerMagia
 */
public class IHacerMagia {

    public static Scanner Teclado = new Scanner(System.in);

    public Object getPoderInicial() {
        return null;
    }

    public static void escogerHechizo() {

        System.out.println("Ahora los hechizos!");

        for (Hechizo h : Hechizo.hechizos) {
            System.out.println(h.numeroHechizo + " " + h.nombre);
        }
        System.out.println("Indica en números, qué hechizos quieres. (Solo puedes 3):");

        int numero;
        int numero2;
        int numero3;

        numero = Teclado.nextInt();
        numero2 = Teclado.nextInt();
        numero3 = Teclado.nextInt();

        String hechizo;
        switch (numero) {
        case 1:

            hechizo = "Cruciatus";
            break;

        case 2:

            hechizo = "Petrificus Totalus";
            break;

        case 3:

            hechizo = "Sectumsempra";
            break;

        case 4:

            hechizo = "Brakium Emendo";
            break;

        case 5:

            hechizo = "Reparifos";
            break;

        case 6:

            hechizo = "Vulnera Sanentur";
            break;

        case 7:

            hechizo = "Cave Inimicum";
            break;

        case 8:

            hechizo = "Expecto Patronum";
            break;

        case 9:

            hechizo = "Protego";
            break;

        default:
            break;
        }

        String hechizo2;
        switch (numero2) {
        case 1:

            hechizo2 = "Cruciatus";
            break;

        case 2:

            hechizo2 = "Petrificus Totalus";
            break;

        case 3:

            hechizo2 = "Sectumsempra";
            break;

        case 4:

            hechizo2 = "Brakium Emendo";
            break;

        case 5:

            hechizo2 = "Reparifos";
            break;

        case 6:

            hechizo2 = "Vulnera Sanentur";
            break;

        case 7:

            hechizo2 = "Cave Inimicum";
            break;

        case 8:

            hechizo2 = "Expecto Patronum";
            break;

        case 9:

            hechizo2 = "Protego";
            break;

        default:
            break;
        }

        String hechizo3;
        switch (numero3) {
        case 1:

            hechizo3 = "Cruciatus";
            break;

        case 2:

            hechizo3 = "Petrificus Totalus";
            break;

        case 3:

            hechizo3 = "Sectumsempra";
            break;

        case 4:

            hechizo3 = "Brakium Emendo";
            break;

        case 5:

            hechizo3 = "Reparifos";
            break;

        case 6:

            hechizo3 = "Vulnera Sanentur";
            break;

        case 7:

            hechizo3 = "Cave Inimicum";
            break;

        case 8:

            hechizo3 = "Expecto Patronum";
            break;

        case 9:

            hechizo3 = "Protego";
            break;

        default:
            break;
        }
        System.out.println("Su jugador es " + JuegoHarryPotter.jugador + " y sus hechizos son " + Hechizo.hechizo + ", "
                + Hechizo.hechizo2 + ", " + Hechizo.hechizo3);

    }

public static void main(String[] args) {}

 static boolean aprenderHechizo(int h);{

 }   





}

