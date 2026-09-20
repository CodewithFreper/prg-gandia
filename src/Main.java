import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona("Cristina", "Fresneda", "29-03-1989", 1.60);

        miPersona.mostrar();

        int opcion;

        Scanner lector = new Scanner(System.in);
        System.out.println("Elije una opción: \n" +
                "1. Crear nuevo socio.\n" +
                "2. Visualizar información de un socio.");
        opcion = lector.nextInt();

        if (opcion == 1) {
            Socio miSocio = new Socio();
        } else {
            System.out.println("Fin del programa");
        }

    }
}
