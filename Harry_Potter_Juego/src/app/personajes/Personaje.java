package app.personajes;



/**
 * Personaje
 */
public class Personaje {

    public String nombre;
    public int edad;
    public int salud= 100;
    public int numeroPersonajeSeleccionado;

    
    
    public Personaje(String nombre) {
        this.nombre= nombre;
    }

    public Personaje(){}
}