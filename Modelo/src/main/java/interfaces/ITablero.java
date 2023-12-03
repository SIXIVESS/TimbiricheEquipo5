/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.DTO.JugadorDTO;
import java.util.List;

/**
 *
 * @author rosal
 */
public interface ITablero {
    public void turnos(List<JugadorDTO>jugadores);
    
    public void otorgarPuntos();
    public void anotarPunto();
}
