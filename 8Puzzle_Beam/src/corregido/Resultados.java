/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corregido;

/**
 *
 * @author CC
 */
public class Resultados {

    public int getAgenda() {
        return agenda;
    }

    public void setAgenda(int agenda) {
        this.agenda = agenda;
    }

    public int getCaso() {
        return caso;
    }

    public void setCaso(int caso) {
        this.caso = caso;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivelGrupo() {
        return nivelGrupo;
    }

    public void setNivelGrupo(int nivelGrupo) {
        this.nivelGrupo = nivelGrupo;
    }

    public int getNodos() {
        return nodos;
    }

    public void setNodos(int nodos) {
        this.nodos = nodos;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }
    private int caso;
    private boolean exito;
    private int nivel;
    private int nivelGrupo;
    private int agenda;
    private int nodos;
    private long tiempo;
    
    public Resultados(){
        caso = 0;
        exito = false;
        nivel = 0;
        nivelGrupo = 0;
        agenda = 0;
        nodos = 0;
        tiempo = 0;
    }
    
}
