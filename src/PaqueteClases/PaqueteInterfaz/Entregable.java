package PaqueteClases.PaqueteInterfaz;

/**
 * Interfaz que declara de forma abstracta unos metodos que se aplicaran la clase Serie y Videojuego
 */
public interface Entregable {
    /**
     *
     * @return cambia el atributo prestado a true.
     */
    void entregar();

    /**
     *
     * @return cambia el atributo prestado a false.
     */
    void devolver();
    /**
     *
     * @return devuelve el estado del atributo prestado.
     */
    boolean isEntregado();

    /**
     *  compara las horas estimadas en los videojuegos y en las series el numero de temporadas.
     *  Como parametro que tenga un objeto, no es necesario que implementes la interfaz Comparable.
     *  Recuerda el uso de los casting de objetos.
     * @param a objeto a comparar
     * @return
     */
    Object compareTo(Object a);

}
