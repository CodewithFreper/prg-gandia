package examen1eval;

import java.util.Scanner;

public class Socio extends Persona{
    protected String email;
    protected String telefono;
    protected String fecha; //Sobreescribe el de la clase padre

    Scanner lector = new Scanner(System.in);

    public Socio(){
        super("", "","",0);
        newSocio();
    }

    public void newSocio(){
        System.out.print("Introduce tu nombre: ");
        nombre = lector.nextLine();
        System.out.print("Introduce tu apellido: ");
        apellido = lector.nextLine();
        System.out.print("Introduce tu altura: ");
        altura = lector.nextDouble();
        lector.nextLine();
        System.out.print("Introduce tu email: ");
        email = lector.nextLine();
        System.out.print("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        fecha = lector.nextLine();
        System.out.print("Introduce tu teléfono: ");
        telefono = lector.nextLine();
        datosSocio();
    }

    public void datosSocio(){
        System.out.println("Nombre: " +  nombre
                + "\nApellido: " + apellido
                + "\nAltura: " +  altura
                + "\nEmail: " + email
                + "\nFecha de nacimiento: "
                + fecha + "\nTeléfono: " + telefono);
    }

}
