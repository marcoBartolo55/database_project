import java.io.FileWriter;
import java.io.IOException;

public class Entidades {
    //* Atributos */
    String nombre;
    String [][] atributos;

    //* Constructor */
    public Entidades(String nombre, String [][] atributos) {
        this.nombre = nombre;
        this.atributos = atributos;
    }

    //* Métodos */
    public void crearArchivo(String nombre, String [][] atributos, String tipo) {
        
        try (FileWriter writer = new FileWriter("/home/marco/database_project/database_project/files/" + nombre + ".txt" ,true)) {
            for (int i=0; i < atributos.length; i++) {
                for (int j=0; j < atributos.length; j++)
                writer.write("Atributo: " + atributos[i][0] + ", Tipo: " + atributos[0][j] + "\n"); 
            }

        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }





}