package app.artefactos;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.IEsMagico;
import app.interfaces.IReliquiaMuerte;

/**
 * Artefacto
 */
public class Artefacto implements IEsMagico {

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

    List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public Artefacto() {

    }

    public void agregarArtefacto() {

        CapaDeInvisibilidad capa = new CapaDeInvisibilidad("Capa de invisibilidad");
        capa.amplificadorDeDaño = 0;
        capa.amplificadorDeSalud = 20;
        capa.numeroDeArtefacto = 1;
        artefactos.add(capa);

        PiedraDeResurreccion piedra = new PiedraDeResurreccion("Piedra de la resurrección");
        piedra.amplificadorDeDaño = 0;
        piedra.amplificadorDeSalud = 100;
        piedra.numeroDeArtefacto = 2;
        artefactos.add(piedra);

        VaritaDeSauco varita = new VaritaDeSauco("Varita de Sauco");
        varita.amplificadorDeDaño = 20;
        varita.amplificadorDeSalud = 0;
        varita.numeroDeArtefacto = 3;
        artefactos.add(varita);

        Horrocrux horrocrux = new Horrocrux("Diario de Tom Riddle");
        horrocrux.amplificadorDeDaño = 20;
        horrocrux.amplificadorDeSalud = 0;
        horrocrux.numeroDeArtefacto = 4;
        artefactos.add(horrocrux);

    }

    public void escogerTipoArtefacto(int n) {

        if (n == 1) {
            System.out.println("Indica el número de tu Reliquia de la Muerte:");
            List<Artefacto> listaReliquias = buscarReliquia();
            for (Artefacto r : listaReliquias) {
                System.out.println(r.numeroDeArtefacto + " " + r.nombre);

            }

        } else {
            System.out.println("Indica el número de tu Artefacto mágico:");
            List<Artefacto> listaComunes = buscarArtefacto();
            for (Artefacto c : listaComunes) {
                System.out.println(c.numeroDeArtefacto + " " + c.nombre);

            }
        }

    }

    public Artefacto escogerArtefacto(int n){
        for (Artefacto ar : artefactos) {
            if(n == ar.numeroDeArtefacto){
                return ar;
            }
            
        }return null;
    }

    public List<Artefacto> buscarReliquia() {
        List<Artefacto> listaReliquias = new ArrayList<>();

        for (Artefacto r : artefactos) {
            if (r instanceof IReliquiaMuerte) {
                listaReliquias.add(r);

            }

        }
        return listaReliquias;
    }

    public List<Artefacto> buscarArtefacto() {
        List<Artefacto> listaComunes = new ArrayList<>();

        for (Artefacto c : artefactos) {
            if (c instanceof Artefacto) {
                listaComunes.add(c);

            }

        }
        return listaComunes;
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

    public boolean esMagico() {
        return true;
    }
}

/*
 * System.out.println(" " + a.numeroDeArtefacto + "  " + a.nombre +
 * "\n     Amplificador de Salud : " + a.amplificadorDeSalud +
 * "\n     Amplificador de Daño: " + a.amplificadorDeDaño);
 */