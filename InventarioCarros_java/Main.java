import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Carro> carros = ArchivoCarros.cargarCarros();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            opcion = Menu.menu();

            if (opcion == 1) {
                System.out.println("Ingresar carros a la base de datos");
                ingresarCarros();
            } else if (opcion == 2) {
                System.out.println("Buscar carro por modelo");
                buscarCarroModelo();
            } else if (opcion == 3) {
                System.out.println("Buscar carro por color");
                buscarCarroColor();
            } else if (opcion == 4) {
                System.out.println("Buscar carro por marca");
                buscarCarroMarca();
            } else if (opcion == 5) {
                System.out.println("Buscar carro por placa");
                buscarCarroPlaca();
            } else if (opcion == 6) {
                System.out.println("Imprimir todos los carros");
                imprimirCarros();
            } else if (opcion == 7) {
                System.out.println("Saliendo...");
                ArchivoCarros.guardarCarros(carros);
            } else {
                System.out.println("Opción no válida, por favor ingrese una opción correcta.");
            }
        }
    }

    public static void ingresarCarros() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el color del carro: ");
        String color = teclado.nextLine();

        System.out.println("Ingrese el modelo del carro: ");
        int modelo = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Ingrese los km que tiene el carro: ");
        int km = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Ingrese la marca del carro: ");
        String marca = teclado.nextLine();

        System.out.println("ingrese la placa del vehiculo: ");
        String placa = teclado.nextLine().toUpperCase();

        Carro nuevoCarro = new Carro(color, modelo, km, marca, placa);
        carros.add(nuevoCarro);

        System.out.println("Carro ingresado correctamente.");
    }

    public static void imprimirCarros() {
        if (carros.isEmpty()) {
            System.out.println("No hay carros registrados.");
        } else {
            for (Carro carro : carros) {
                carro.mostrarInfo();
            }
        }
    }

    public static void buscarCarroModelo() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el modelo del carro que quiere: ");
        int modelo = teclado.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getModelo() == modelo) {
                carro.mostrarInfo();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("no fue encontrado");
        }
    }

    public static void buscarCarroColor() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el color del carro que quiere: ");
        String color = teclado.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getColor().equals(color)) {
                carro.mostrarInfo();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("no fue encontrado");
        }
    }

    public static void buscarCarroMarca() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese la marca del carro que quiere: ");
        String marca = teclado.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getMarca().equals(marca)) {
                carro.mostrarInfo();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("no fue encontrado");
        }
    }

    public static void buscarCarroPlaca() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese la placa del carro que quiere: ");
        String placa = teclado.nextLine().toUpperCase();

        boolean encontrado = false;

        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getPlaca().equals(placa)) {
                carro.mostrarInfo();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("no fue encontrado");
        }
    }
}
