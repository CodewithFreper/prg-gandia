package examen1eval;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Aplicacion {

    Scanner lector = new Scanner(System.in);
    int dia, mes, anyo;

    public int crearDia(){
        System.out.print("Introduce el día (dd): ");
        dia = lector.nextInt();
        return dia;
    }

    public int crearMes(){
        System.out.print("Introduce el mes (mm): ");
        mes = lector.nextInt();
        return mes;
    }

    public int crearAnyo(){
        System.out.print("Introduce el año (aaaa): ");
        anyo = lector.nextInt();
        return anyo;
    }


    Fecha fecha1 = new Fecha(dia, mes, anyo);





}
