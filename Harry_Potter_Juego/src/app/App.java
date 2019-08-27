package app;

import java.util.Scanner;
import app.poderes.hechizos.Hechizo;


public class App {
    public static Scanner Teclado = new Scanner (System.in);
        
    
    public static void main(String[] args) {
        
        JuegoHarryPotter juego = new JuegoHarryPotter();
        juego.cargarPersonajes();
        juego.escogerJugador();

        Hechizo.cargarHechizos();
        Hechizo.escogerHechizo();
        



    }
}