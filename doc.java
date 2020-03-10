
/**
 * Clase para realizar el examen de Entornos de Desarollo de 1º de DAW
 * 
 * @author (David) 
 * @version (10/03/2020 1.0v)
 */
public interface doc
{
   
   // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
   /**
    * Metodo que introduciendo un fichero, te dice el contenido de una linea en concreto
    * @param x el numero de la fila del fichero
    * @param file la ruta absoluta del fichero
    * @return devuelve la linea x del fichero en la ruta file
    */
   public abstract String obtenerLinea(int x, String file);
   
   /**
    * Metodo que introduciendo una calle, te dice la posicion geografica de la misma
    * @param calle direccion dada para saber la posicion geografica
    * @return devuelve la posicion geográfica dada la calle
    */
   public abstract String posicionGeografica(String calle);
}
