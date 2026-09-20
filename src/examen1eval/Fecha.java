package examen1eval;

public class Fecha {
    int dia, mes, anyo;

    public Fecha(int dia, int mes, int anyo){
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public void visualizarFecha(){
        System.out.println(dia + "/" + mes + "/" + anyo);
    }

    private boolean comprobarFecha(){
        if (mes < 1 || mes >12){
            return false;
        }

        if (anyo < 1971 || anyo > 2100){
            return false;
        }

        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12) && (dia < 1 || dia > 31)){
            System.out.println("Fecha no válida.");
            return false;
        } else if (mes == 2 && (dia < 1 || dia > 28)){
            System.out.println("Fecha no válida.");
            return false;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)){
            System.out.println("Fecha no válida.");
            return false;
        } else {
            return true;
        }
    }
}
