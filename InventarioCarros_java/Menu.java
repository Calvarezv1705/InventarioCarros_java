import java.util.Scanner;

public class Menu {

    private int opcion;

    public void menu(int opcion) {
        this.opcion = opcion;
    }

    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Ingresar carros a la base de datos");
        System.out.println("2. Buscar carro por modelo");
        System.out.println("3. Buscar carro por color");
        System.out.println("4. Buscar carro por marca");
        System.out.println("5. Buscar carro por placa");
        System.out.println("6. Imprimir todos los carros");
        System.out.println("7. Salir/Guardar");
        int opcion = teclado.nextInt();

        return opcion;
    }

    public int getOpcion() {
        return opcion;
    }
}
