package modelo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author chaly
 */
public class SalaEspera implements interfaces.ISalaEspera{

    @Override
    public Sala crearSala(Jugador anfitrion) {
String codigo = this.generarCodigo();
        Sala sala = new Sala(codigo);
        sala.setJugadores(Arrays.asList(anfitrion));
        return sala;    }

    
     private String generarCodigo() {
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int longitudCadena = 8;
        StringBuilder codigo = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < longitudCadena; i++) {
            int indice = random.nextInt(caracteresPermitidos.length());
            char caracterAleatorio = caracteresPermitidos.charAt(indice);
            codigo.append(caracterAleatorio);
        }
        return codigo.toString();
    }
     
     @Override
    public void unirseSala(String codigo, Jugador jugador) {
    }
}
