package interfaces;

/**
 * La interfaz IMenuPrincipal proporciona métodos para la navegación y acciones
 * en el menú principal de una aplicación o juego. Los métodos incluyen acciones
 * relacionadas con los botones de creación y unión de juegos, así como la
 * funcionalidad para abrir el menú y salir de la aplicación.
 *
 * @author Equipo 5
 */
public interface IMenuPrincipal {

    /**
     * Acción relacionada con el botón de creación de juego en el menú
     * principal.
     */
    public void btnCrear();

    /**
     * Acción relacionada con el botón de unirse a un juego en el menú
     * principal.
     */
    public void btnUnire();

    /**
     * Abre el menú principal en la aplicación o juego.
     */
    public void abrirMenu();

    /**
     * Permite al usuario salir de la aplicación o juego desde el menú
     * principal.
     */
    public void salir();
}
