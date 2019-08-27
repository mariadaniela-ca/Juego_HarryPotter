package app.artefactos;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.IReliquiaMuerte;

/**
 * Artefacto
 */
public class Artefacto implements IReliquiaMuerte {

    public String nombre;

    public Artefacto(String n) {
        this.nombre = n;
    }

    // piedra Filosofal ( da vida)
    // Espada de Godric Gryffindor ( quita mas vida);
    // Bludger (derribar, quita vida )
    // Galeón de oro (da mas vida)
    public int amplificadorDeDaño;

    public int amplificadorDeSalud;

    public int numeroDeArtefacto;

    List<Artefacto> reliquias = new ArrayList<Artefacto>();

    public Artefacto() {

    }

    public void agregarReliquia() {

        CapaDeInvisibilidad capa = new CapaDeInvisibilidad("Capa de invisibilidad");
        capa.amplificadorDeDaño = 0;
        capa.amplificadorDeSalud = 20;
        capa.numeroDeArtefacto = 1;
        reliquias.add(capa);

        PiedraDeResurreccion piedra = new PiedraDeResurreccion("Piedra de la resurrección");
        piedra.amplificadorDeDaño = 0;
        piedra.amplificadorDeSalud = 100;
        piedra.numeroDeArtefacto = 2;
        reliquias.add(piedra);

        VaritaDeSauco varita = new VaritaDeSauco("Varita de Sauco");
        varita.amplificadorDeDaño = 20;
        varita.amplificadorDeSalud = 0;
        varita.numeroDeArtefacto = 3;
        reliquias.add(varita);

    }

    public void mostrarArtefactos() {
        for (Artefacto a : this.reliquias) {
            System.out.println(" " + a.numeroDeArtefacto + "  " + a.nombre + "\n     Amplificador de Salud : "
                    + a.amplificadorDeSalud + "\n     Amplificador de Daño: " + a.amplificadorDeDaño);

        }
    }

    public Artefacto escogerArtefacto(int numero) {
        for (Artefacto a : reliquias) {
            if (numero == a.numeroDeArtefacto) {
                return a;
            }

        }
        return null;
    }

    public boolean esInvisibleAMuggles() {
        return false;
    }

    public boolean esInvisible() {
        return false;
    }

    public int getAmplificadordeDaño() {
        return this.amplificadorDeDaño;

    }

    public int getAmplificadordeSalud() {
        return this.amplificadorDeDaño;

    }

    public boolean esReliquia() {
        return false;
    }
}