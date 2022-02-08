package Ejercicio10;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle*/
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Date fechaActual = new Date();
        System.out.println("Ingrese Año: ");
        int anio = read.nextInt();
        System.out.println("Ingrese Mes: ");
        int mes = read.nextInt();
        System.out.println("Ingrese dia: ");
        int dia = read.nextInt();
        Date fecha = new Date(anio, mes, dia);
        System.out.printf("La fecha ingresada es %d/%d/%d \n", fecha.getYear(), fecha.getMonth(), fecha.getDate());

        System.out.printf("la fecha de hoy es %d/%d/%d  \n", fechaActual.getYear() + 1900, fechaActual.getMonth() + 1, fechaActual.getDate());

        int diferencia = (fechaActual.getYear() + 1900) - fecha.getYear();

        if (fechaActual.getMonth()<=fecha.getMonth()+1) {
            if (fechaActual.getMonth() == fecha.getMonth() + 1) {
                if (fecha.getDate() > fechaActual.getDate()) {
                    diferencia--;
                }
            }
        } else {
            diferencia--;
        }
        System.out.printf("La cantidad de años entre fechas es %d \n", diferencia);
    }

}
