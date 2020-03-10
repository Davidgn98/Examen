
/**
 * Write a description of class doc here.
 * 
 * @author (David) 
 * @version (10/03/2020 1.0v)
 */
public interface doc
{
   
   // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
   /**
    * @param x el numero de la fila del fichero
    * @param file la ruta absoluta del fichero
    * @return devuelve la linea x del fichero en la ruta file
    */
   public abstract String obtenerLinea(int x, String file);
   
   
}
