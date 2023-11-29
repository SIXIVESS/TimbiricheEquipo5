package interfaces;

/**
 *
 * @author chaly
 */
public interface ICliente {

    boolean conectarAlServidor(String address, int port);

    boolean enviarAlServidor(Object mensaje);

    void escucharAlServidor();
}
