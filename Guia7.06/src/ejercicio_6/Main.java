package ejercicio_6;

/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.

1000 cc = 1 litro
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafetera = new Cafetera(0, 1000);
        int opcion, opcionSubMenu;
        do {
            System.out.println("--------MENU NESPRESSO--------");
            System.out.println("1-Llenar cafetera");
            System.out.println("2-Servir taza");
            System.out.println("3-vaciar cafetera");
            System.out.println("4-Agregar Cafe");
            System.out.println("5-Mostrar cuanto cafe queda");
            System.out.println("6-SALIR");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    do {
                        System.out.println("-----SUB MENU-----");
                        System.out.println("1-Taza de 150cc");
                        System.out.println("2-Taza de 250cc");
                        System.out.println("3-Taza de 300cc");
                        opcionSubMenu = read.nextInt();
                        switch (opcionSubMenu) {
                            case 1:
                                cafetera.servirTaza(150);
                                break;
                            case 2:
                                cafetera.servirTaza(250);
                                break;
                            case 3:
                                cafetera.servirTaza(300);
                                break;
                            default:
                                System.out.println("Ingrese opcion correcta!");
                        }
                    } while (opcionSubMenu < 1 || opcionSubMenu > 3);
                    break;
                case 3:
                    cafetera.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Ingrese cafe a la cafetera");
                    cafetera.agregarCafe(read.nextInt()); 
                    break;
                case 5:
                    cafetera.mostrarCantidadDeCafe();
                    break;
                case 6:
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
        } while (opcion!=6);
    }

}
