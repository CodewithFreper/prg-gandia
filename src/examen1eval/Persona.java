package examen1eval;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String fecha;
    protected double altura;

    public Persona(String nombre, String apellido, String fecha, double altura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.altura = altura;
    }

    public void mostrar(){
        System.out.println("Nombre: " + nombre
                + "\nApellido: " + apellido
                + "\nFecha: " + fecha
                + "\nAltura: " + altura);
    }
}
