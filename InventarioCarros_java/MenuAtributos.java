import java.util.Scanner;

public class MenuAtributos {

    private int cambiarAtributo;

    public void menuAtributos(int cambiarAtributo) {
        this.cambiarAtributo = cambiarAtributo;
    }

    public static int menuAtributos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. color del carro: ");
        System.out.println("2. modelo del carro: ");
        System.out.println("3. km que tiene el carro: ");
        System.out.println("4. marca del carro: ");
        System.out.println("5. placa del vehiculo: ");
        System.out.println("6. salir");
        System.out.println("ingrese el atributo que quiere modificar");
        int cambiarAtributo = teclado.nextInt();

        return cambiarAtributo;
    }

    public int getcambiarAtributo() {
        return cambiarAtributo;
    }
}
