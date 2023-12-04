package dominio;

import dominio.DTO.JugadorDTO;
import enumeradores.Posicion;
import interfaces.ITablero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author brawun
 */
public class Tablero  implements ITablero{

    private int dimension;
    private List<Linea> lineasHorizontales;
    private List<Linea> lineasVerticales;
    private List<Cuadro> cuadros;
    private List<Punto> puntos;
    private int turnoActual = 0;

    public Tablero() {
        lineasHorizontales = new ArrayList<>();
        lineasVerticales = new ArrayList<>();
        cuadros = new ArrayList<>();
        puntos = new ArrayList<>();
    }

   

    public Tablero(int tamanio) {
        lineasHorizontales = new ArrayList<>();
        lineasVerticales = new ArrayList<>();
        cuadros = new ArrayList<>();
        puntos = new ArrayList<>();

        switch (tamanio) {
            case 2:
                this.dimension = 10;
                break;
            case 3:
                this.dimension = 20;
                break;
            case 4:
                this.dimension = 40;
                break;
        }
    }
    

    public void generaInstanciasDeFormaJuego() {
        //Todo esto se crea para poder asignar un jugador despues
        //Crea instancias de lineas y las guarda en una estructura
        for (int i = 0; i < ((dimension - 1) * dimension); i++) {
            lineasHorizontales.add(new Linea(Posicion.HORIZONTAL, null, i));
            lineasVerticales.add(new Linea(Posicion.VERTICAL, null, i));
        }

        //Crea instancias de Cuadro utilizando las instancias de lineas creadas
        for (int i = 0; i < dimension - 1; i++) {
            int indicador = i;
            for (int j = i * (dimension - 1); j < i * (dimension - 1) + (dimension - 1); j++) {
                cuadros.add(new Cuadro(lineasHorizontales.get(j),
                        lineasHorizontales.get(j + (dimension - 1)),
                        lineasVerticales.get(indicador),
                        lineasVerticales.get(indicador + (dimension - 1)), null, j));

                indicador += (dimension - 1);
            }
        }
    }

    public Tablero(int dimension, List<Linea> lineasHorizontales, List<Linea> lineasVerticales, List<Cuadro> cuadros, List<Punto> puntos) {
        this.dimension = dimension;
        this.lineasHorizontales = lineasHorizontales;
        this.lineasVerticales = lineasVerticales;
        this.cuadros = cuadros;
        this.puntos = puntos;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<Linea> getLineasHorizontales() {
        return lineasHorizontales;
    }

    public void setLineasHorizontales(List<Linea> lineasHorizontales) {
        this.lineasHorizontales = lineasHorizontales;
    }

    public List<Linea> getLineasVerticales() {
        return lineasVerticales;
    }

    public void setLineasVerticales(List<Linea> lineasVerticales) {
        this.lineasVerticales = lineasVerticales;
    }

    public List<Cuadro> getCuadros() {
        return cuadros;
    }

    public void setCuadros(List<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }

    public List<Punto> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Punto> puntos) {
        this.puntos = puntos;
    }

    @Override
    public void turnos(List<JugadorDTO> jugadores) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void otorgarPuntos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void anotarPunto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
