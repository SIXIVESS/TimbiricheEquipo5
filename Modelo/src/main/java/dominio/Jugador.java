/**
 * Jugador.java
 */
package dominio;

import java.awt.Color;
import java.util.Objects;

/**
 * La clase Jugador representa a un jugador en el juego.
 *
 * @author Equipo 5
 */
public class Jugador {

    private String nombre;
    private String rutaColor;
    private int puntaje;
    private Preferencia preferencia;
    private String color;

    public Jugador(String nombre, String rutaColor) {
        this.nombre = nombre;
        this.rutaColor = rutaColor;
    }

    public Jugador(String nombre, String rutaColor, int puntaje) {
        this.nombre = nombre;
        this.rutaColor = rutaColor;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaColor() {
        return rutaColor;
    }

    public void setRutaColor(String rutaColor) {
        this.rutaColor = rutaColor;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Preferencia getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(Preferencia preferencia) {
        this.preferencia = preferencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return this.nombre + " - " + this.getRutaColor();
    }
}
