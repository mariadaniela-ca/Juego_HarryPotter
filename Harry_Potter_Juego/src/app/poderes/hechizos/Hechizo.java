package app.poderes.hechizos;

import java.util.ArrayList;
import java.util.List;

import app.personajes.Wizard;
import app.poderes.Poder;
import app.poderes.hechizos.hechizosataque.Cruciatus;
import app.poderes.hechizos.hechizosataque.PetrificusTotalus;
import app.poderes.hechizos.hechizosataque.Sectumsempra;
import app.poderes.hechizos.hechizoscuracion.BrackiumEmendo;
import app.poderes.hechizos.hechizoscuracion.Reparifors;
import app.poderes.hechizos.hechizoscuracion.VulneraSanentur;
import app.poderes.hechizos.hechizosdefensa.CaveInimicum;
import app.poderes.hechizos.hechizosdefensa.ExpectoPatronum;
import app.poderes.hechizos.hechizosdefensa.Protego;

/**
 * Hechizo
 */
public class Hechizo extends Poder {
    public String nombre;
    public boolean EsOscuro;
    public int nivelDeDaño;
    public int nivelDeCuracion;
    public int nivelDeProteccion;
    public int numeroHechizo;

    public Hechizo (String nombre){
        this.nombre = nombre;
    }
    
    public static List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public static void aprenderHechizo() {}
    public static void buscarHechizo(){}
    public static void cargarHechizos() {

        Cruciatus c = new Cruciatus("Cruciatus");
        c.EsOscuro = true;
        c.nivelDeCuracion = 0;
        c.nivelDeDaño = 50;
        c.nivelDeProteccion = 0;
        c.numeroHechizo= 1;
        hechizos.add(c);

        PetrificusTotalus p = new PetrificusTotalus("Petrificus Totalus");
        p.EsOscuro = false;
        p.nivelDeCuracion = 0;
        p.nivelDeDaño = 20;
        p.nivelDeProteccion = 0;
        p.numeroHechizo= 2;
        hechizos.add(p);

        Sectumsempra s = new Sectumsempra("Sectumsempra");
        s.EsOscuro = false;
        s.nivelDeCuracion = 0;
        s.nivelDeDaño = 10;
        s.nivelDeProteccion = 0;
        s.numeroHechizo= 3;
        hechizos.add(s);

        BrackiumEmendo b = new BrackiumEmendo("Brakium Emendo");
        b.EsOscuro = false;
        b.nivelDeCuracion = 20;
        b.nivelDeDaño = 0;
        b.nivelDeProteccion = 0;
        b.numeroHechizo= 4;
        hechizos.add(b);

        Reparifors r = new Reparifors("Reparifos");
        r.EsOscuro = false;
        r.nivelDeCuracion = 15;
        r.nivelDeDaño = 0;
        r.nivelDeProteccion = 0;
        r.numeroHechizo= 5;
        hechizos.add(r);

        VulneraSanentur v = new VulneraSanentur("Vulnera Sanentur");
        v.EsOscuro = false;
        v.nivelDeCuracion = 20;
        v.nivelDeDaño = 0;
        v.nivelDeProteccion = 0;
        v.numeroHechizo= 6;
        hechizos.add(v);

        CaveInimicum ci = new CaveInimicum("Cave Inimicum");
        ci.EsOscuro = false;
        ci.nivelDeCuracion = 0;
        ci.nivelDeDaño = 0;
        ci.nivelDeProteccion = 5;
        ci.numeroHechizo= 7;
        hechizos.add(ci);

        ExpectoPatronum e = new ExpectoPatronum("Expecto Patronum");
        e.EsOscuro = false;
        e.nivelDeCuracion = 0;
        e.nivelDeDaño = 0;
        e.nivelDeProteccion = 10;
        e.numeroHechizo= 8;
        hechizos.add(e);

        Protego pr = new Protego("Protego");
        pr.EsOscuro = false;
        pr.nivelDeCuracion = 0;
        pr.nivelDeDaño = 0;
        pr.nivelDeProteccion = 15;
        pr.numeroHechizo= 9;
        hechizos.add(pr);

    }
    
    public static void escogerHechizo(){
        System.out.println("Ahora los hechizos!");
        for (Hechizo h : hechizos) {
            System.out.println(h.numero+ " "+ h.nombre);
        }
        System.out.println("Elija el número de su hechizo:");}
    
        int numero;
        numero= Teclado.nextInt();
        

    public static void buscarHechizo (int numero) { 

        switch (numero) {
            case 1: for (Hechizo h : Wizard.hechizosAprendidosHarry) {  
                if (numero  == h.numero) {
                                System.out.println("Su personaje ya aprendió ese hechizo");
                } else {
                    System.out.println("Su personaje debe aprender el hechizo para usarlo");
                    aprenderHechizo();}
            }
                break;
            
            case 2: for (Hechizo h : Wizard.hechizosAprendidosRon) {  
                if (numero== h.numero) {
                                System.out.println("Su personaje ya aprendió ese hechizo");
                } else {
                    System.out.println("Su personaje debe aprender el hechizo para usarlo");
                    aprenderHechizo();}
                } break;

            case 3: for (Hechizo h : Wizard.hechizosAprendidosHermione) {  
                if (numero== h.numero) {
                                System.out.println("Su personaje ya aprendió ese hechizo");
                } else {
                    System.out.println("Su personaje debe aprender el hechizo para usarlo");
                    aprenderHechizo();}
                } break;
        
            default:
                break;
        }

    
}
        
    }
    


  