package app.poderes.hechizos;

import app.poderes.Poder;

/**
 * Hechizo
 */
public class Hechizo extends Poder {

    public Hechizo(String nombre) {
        this.nombre = nombre;
    }

    public String nombre;
    public boolean esOscuro;
    public int nivelDeDaño;
    public int nivelDeCuracion;
    public int nivelDeProteccion;
    public int identificador;
    public int nivelDeEnergia;

    int tipoHechizo1;
    int tipoHechizo2;
    int tipoHechizo3;

    int hechizoElegido1;
    int hechizoElegido2;
    int hechizoElegido3;

}
