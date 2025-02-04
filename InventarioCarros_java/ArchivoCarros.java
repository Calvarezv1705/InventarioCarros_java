import java.io.*;
import java.util.ArrayList;

public class ArchivoCarros {

    private static final String ARCHIVO_CARROS = "carros.txt";

    public static void guardarCarros(ArrayList<Carro> carros) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CARROS))) {
            for (Carro carro : carros) {
                writer.write(carro.toFileFormat());
                writer.newLine();
            }
            System.out.println("Carros guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar los carros: " + e.getMessage());
        }
    }

    public static ArrayList<Carro> cargarCarros() {
        ArrayList<Carro> carros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CARROS))) {
            String line;
            while ((line = reader.readLine()) != null) {
                carros.add(Carro.fromFileFormat(line));
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los carros: " + e.getMessage());
        }
        return carros;
    }
}
